package com.xiaolyuh.tsf.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableFeignClients // 使用Feign微服务调用时请启用
//@EnableTsf
public class ProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }

}
