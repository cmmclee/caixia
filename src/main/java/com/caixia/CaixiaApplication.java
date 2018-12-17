package com.caixia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.caixia.dao")
@ServletComponentScan("com.caixia.common.filter")
public class CaixiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaixiaApplication.class, args);
	}
}
