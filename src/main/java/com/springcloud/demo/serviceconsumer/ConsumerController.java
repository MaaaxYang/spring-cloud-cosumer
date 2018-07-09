package com.springcloud.demo.serviceconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired(required = false)
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

    @RequestMapping("/hello2/{name}")
    public String index2(@PathVariable("name") String name) {
        return HelloRemote.hello2(name);
    }

    @RequestMapping("/see")
    public String normal(){
        return "i'm just want let you see";
    }

}