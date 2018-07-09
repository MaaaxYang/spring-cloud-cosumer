package com.springcloud.demo.serviceconsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello2" +name+", this messge send failed ";
    }
}