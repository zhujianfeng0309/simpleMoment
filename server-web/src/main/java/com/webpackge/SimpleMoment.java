package com.webpackge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
/**
 * Created by zjf on 2019/6/4.
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages="{com.webpackge}")
public class SimpleMoment {
        public static void main(String[] args) {
            SpringApplication.run(SimpleMoment.class, args);
        }

}
