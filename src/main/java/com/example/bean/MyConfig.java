package com.example.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 我的测试类
 * @Author cheng
 * @Date 17:06
 **/
@Configuration
public class MyConfig {

    @Bean
    public People people(){
        return new People();
    }

}
