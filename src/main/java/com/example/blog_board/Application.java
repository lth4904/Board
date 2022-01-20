package com.example.blog_board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.blog_board")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
