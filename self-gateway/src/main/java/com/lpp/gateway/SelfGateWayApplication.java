package com.lpp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lpp
 * @date 2020/12/29
 */
@SpringBootApplication
@EnableEurekaClient
public class SelfGateWayApplication {
    public static void main(String[] args) {
        //sentinel控制台标记为网关
        System.setProperty("csp.sentinel.app.type","1");
        SpringApplication.run(SelfGateWayApplication.class, args);
    }
}
