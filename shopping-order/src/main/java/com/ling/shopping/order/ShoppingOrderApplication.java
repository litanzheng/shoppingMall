package com.ling.shopping.order;

import com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@EnableDiscoveryClient
@SpringBootApplication(exclude = {GlobalTransactionAutoConfiguration.class})
@EnableFeignClients
public class ShoppingOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingOrderApplication.class, args);
    }

}
