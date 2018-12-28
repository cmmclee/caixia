package com.caixia.dao;

import com.caixia.entity.DateEvent;

import java.util.List;

public interface DateEventMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DateEvent record);

    int insertSelective(DateEvent record);

    DateEvent selectByPrimaryKey(Long id);

    List<DateEvent> listSelective(DateEvent dateEvent);

    int updateByPrimaryKeySelective(DateEvent record);

    int updateByPrimaryKey(DateEvent record);
}