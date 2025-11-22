package com.ling.shopping.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ling.shopping.member.feign")
public class ShoppingMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMemberApplication.class, args);
    }

}
