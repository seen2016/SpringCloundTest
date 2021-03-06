package com.springcloud.configremoteserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by seen on 2020/1/21.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigRemoteServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigRemoteServerApplication.class,args);
    }
}
