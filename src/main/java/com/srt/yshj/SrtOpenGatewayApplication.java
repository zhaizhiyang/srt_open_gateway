package com.srt.yshj;

import com.srt.yshj.filter.RequestTimeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.srt.yshj.*"})
@SpringBootApplication
public class SrtOpenGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrtOpenGatewayApplication.class, args);
    }



}
