package com.tfl.dengta;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 */
@SpringBootApplication
@MapperScan("com.tfl.usercenter.mapper")
public class DengTaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DengTaApplication.class, args);
    }

}

