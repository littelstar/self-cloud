package com.lpp.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lpp
 * @date 2020/12/29
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @RequestMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(2000);
        return "Admin-Customer测试";
    }
}
