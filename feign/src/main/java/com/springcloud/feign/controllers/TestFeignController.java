package com.springcloud.feign.controllers;

import com.springcloud.feign.feigninterface.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by seen on 2020/1/20.
 */
@RestController
@RequestMapping("/feign")
public class TestFeignController {
    @Autowired
    FeignProviderClient feignProviderClient;

    @GetMapping("/test")
    public String testA(){
        return feignProviderClient.testA();
    }
}
