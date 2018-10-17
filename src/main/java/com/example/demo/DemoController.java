package com.example.demo;

import com.example.bean.People;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author cheng
 * @Date 17:33
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("json")
    public People getData(){
        People demo =new People();
        demo.setId("111");
        demo.setName("张三");
        return  demo;
    }




}
