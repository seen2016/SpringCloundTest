package com.springcloud.remoteconfigclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by seen on 2020/1/21.
 */
@RestController
@RequestMapping("/remoteconfigclient")
public class TestController {

    @Value("${server.port}")
    public String port;

    @GetMapping("/index")
    public String index(){
        return port+"wftdsa";
    }
}
