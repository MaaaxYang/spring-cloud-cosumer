package com.springcloud.demo.serviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class ServiceConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceConsumerApplication.class, args);
	}
}
