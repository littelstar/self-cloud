package com.lpp.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lpp
 * @date 2020/12/29
 */
@RestController
@RequestMapping("/admin")
public class TestController {

    @RequestMapping("/test")
    public String  test(){
        return "Admin-Test返回结果";
    }

    @RequestMapping("/test1")
    public String  test1(){
        return "Admin测试Gateway返回";
    }
}
