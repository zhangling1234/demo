package com.example.demo;

import com.example.bean.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = "com.example")
public class DemoApplication {


	@RequestMapping("/cheng")
	public String hello(){
		String str ="{'name':'中国','province':Array[4]}";
		return str;
	}
	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(DemoApplication.class,args);
		People cat = context.getBean(People.class);
		System.out.println(cat);

	}
}
