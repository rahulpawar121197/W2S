package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Model.User;
import com.spring.Service.UserService;

@RestController

public class LoginController {
	
	
	
	@Autowired
	UserService userservice;
	
	
	@GetMapping("/login")
	
	
	public ResponseEntity<User> login(@RequestBody User user){
		
		String username=user.getUsername();
		String password=user.getUserpwd();
		
		User user1=userservice.login(username,password);
		
		
		
		return ResponseEntity.ok().body(user1);
		  
		 
		
		
		
		
	}

}
