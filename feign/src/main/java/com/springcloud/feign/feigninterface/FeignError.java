package com.springcloud.feign.feigninterface;

import org.springframework.stereotype.Component;

/**
 * Created by seen on 2020/1/20.
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String testA() {
        return "出错了";
    }
}
