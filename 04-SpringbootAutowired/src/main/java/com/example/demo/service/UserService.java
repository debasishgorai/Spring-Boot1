package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.usedao.UserDao;

@Service
public class UserService {
private UserDao userDao=null;
@Autowired
public UserService(UserDao userDao) {
	this.userDao= userDao
;	
}




public void RegisterUser() {
boolean isSaved=	userDao.SaveUser("Debasish", "debasishgorai.121@gmail.com", "deva");
	if(isSaved) {
		System.out.println("save succesfully");
	}
	else {
		System.out.println("error");
	}
}
}
