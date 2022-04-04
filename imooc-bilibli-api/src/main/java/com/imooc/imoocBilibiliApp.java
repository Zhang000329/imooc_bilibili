package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class imoocBilibiliApp {
    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(imoocBilibiliApp.class, args);
    }
}
