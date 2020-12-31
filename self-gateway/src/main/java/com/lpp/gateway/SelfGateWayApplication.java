package com.lpp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lpp
 * @date 2020/12/29
 */
@SpringBootApplication
public class SelfGateWayApplication {
    public static void main(String[] args) {
        //sentinel控制台标记为网关
        System.setProperty("csp.sentinel.app.type","1");
        SpringApplication.run(SelfGateWayApplication.class, args);
    }
}
