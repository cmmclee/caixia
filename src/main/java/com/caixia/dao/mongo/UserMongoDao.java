package com.caixia.dao.mongo;

import com.caixia.common.dao.BaseMongoDao;
import com.caixia.dao.UserMapper;
import com.caixia.entity.User;
import com.caixia.entity.mongo.UserMongoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserMongoDao extends BaseMongoDao<UserMongoEntity> {
	
	@Autowired
	private UserMapper userMapper;

	private static Logger logger = LoggerFactory.getLogger(UserMongoDao.class);

	public void saveUserMongoEntity(UserMongoEntity user) {
		try {
			save(user);
		} catch (Exception e) {
			logger.error("saveUserMongoEntity is error", e);
		}
	}

	public UserMongoEntity getUserMongoEntity(String name){
		Query query = Query.query(Criteria.where("name").is(name));
		try {
			UserMongoEntity mongoUser = findOne(query);
			if(null != mongoUser){
				return mongoUser;
			}else{
				User user = userMapper.findByName(name);
				return  saveUser2Mongo(user);
			}
		} catch (Exception e) {
			logger.error("findOne is error",e);
		}
		return null;
	}

	private UserMongoEntity saveUser2Mongo(User user){
		UserMongoEntity userMongoEntity = new UserMongoEntity();
		userMongoEntity.setName(user.getName());
		userMongoEntity.setId(user.getId());
		userMongoEntity.setAge(user.getAge());
		saveUserMongoEntity(userMongoEntity);
		return userMongoEntity;
	}

}