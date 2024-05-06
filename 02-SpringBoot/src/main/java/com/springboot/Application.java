package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.util"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
  ConfigurableApplicationContext cxt=SpringApplication.run(Application.class, args);
//  int count=cxt.getBeanDefinitionCount();
//  System.out.println("bean factory:"+count);
//  String []names=cxt.getBeanDefinitionNames();
//  for(String name: names) {
//	  System.out.println(name);
//  }
	}

}
