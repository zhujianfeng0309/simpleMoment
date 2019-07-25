package com.ali;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/6/4.
 */
@SpringBootApplication
@EnableDubboConfig
public class DubboProvide {
        public static void main(String[] args) {
            SpringApplication.run(DubboProvide.class, args);
        }

}
