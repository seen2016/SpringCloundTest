package com.springcloud.provider.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seen on 2020/1/20.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/findTest")
    public String testA(){
        return "你好";
    }
}
