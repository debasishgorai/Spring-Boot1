package com.example.demo.Service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.utills.DateUtills;
@org.springframework.stereotype.Service
public class Service {
@Autowired
private DateUtills du;
public void RecordReport() {
	LocalDate Date =du.getDate();
	
	System.out.println("Current DaTE is"+Date);
	
}
}
