package com.caixia.constant;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class RedisCacheNames {

    public static final String _USER = "1";// 用户

    /**
     * 缓存时长 单位:秒
     */
    public static final Long _PERIOD_SECOND_01 = 10L;//

    /**
     * 根据key设定具体的缓存时间
     */
    private Map<String, Long> expiresMap = null;

    @PostConstruct
    public void init(){
        expiresMap = new HashMap<>();
        expiresMap.put(_USER, _PERIOD_SECOND_01);
    }

    public Map<String, Long> getExpiresMap(){
        return this.expiresMap;
    }

}
