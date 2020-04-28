package com.example.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by jamy on 2020-04-22
 */

@SpringBootApplication
public class SpringApplicationDemo extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringApplicationDemo.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringApplicationDemo.class, args);
    }
}
