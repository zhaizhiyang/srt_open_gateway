package com.srt.yshj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.srt.yshj.*"})
@SpringBootApplication
public class SrtOpenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrtOpenGatewayApplication.class, args);
    }



}
