package com.talataa.prueba.tmdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TalataaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TalataaApiApplication.class, args);
    }

}
