package com.example.demo.usedao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public boolean SaveUser(String name,String email,String pwd) {
		System.out.println("storing the data");
		return true;
	}

}
