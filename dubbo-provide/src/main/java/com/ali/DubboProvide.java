package com.ali;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by Administrator on 2019/6/4.
 */


@SpringBootApplication
public class DubboProvide {
        public static void main(String[] args) {
            SpringApplication.run(DubboProvide.class, args);
            try {
                System.in.read(); // 按任意键退出
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

}
