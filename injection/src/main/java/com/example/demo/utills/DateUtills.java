package com.example.demo.utills;

import java.time.LocalDate;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DateUtills {

	
	public LocalDate getDate() {
		LocalDate l=LocalDate.now();
		return l;
	}
	
	
	
}
