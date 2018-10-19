package com.caixia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.caixia.dao")
public class CaixiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaixiaApplication.class, args);
	}
}
