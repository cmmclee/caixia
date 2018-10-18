package com.caixia.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: LiChaoChao
 * @date: 2018-10-18
 */
@Configuration
public class CaiXiaConfig {

    @Value("${caixia.config.name}")
    private String name;

    @Value("${caixia.config.birthday}")
    private String brithday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday;
    }
}
