package com.store.dubbo.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.store.dubbo.server.mapper")
public class SpringbootDubboServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboServerApplication.class, args);
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
