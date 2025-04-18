package com.tron.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TronLegacyApp extends SpringBootServletInitializer {

    // This method is needed to configure the application for WAR deployment
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TronLegacyApp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TronLegacyApp.class, args);
    }
}
