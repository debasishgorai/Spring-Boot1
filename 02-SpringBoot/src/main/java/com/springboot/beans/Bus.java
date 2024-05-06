package com.springboot.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.springboot.Car;

@Component
public class Bus {
public Bus() {
	System.out.println("Bus-09900");
}
@Bean
public Car getCar() {
	Car c= new Car();
	return c;
}
}
