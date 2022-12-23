package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Model.User;
import com.spring.Service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	
	
	@Autowired
	
	UserService userservice;
	
	
	@PutMapping("/Save")
	
	public ResponseEntity<User> save(@RequestBody User user){
		
		
		   
		User user1=userservice.save(user);
		
		return ResponseEntity.ok().body(user1);
		
	}
	
     @PostMapping("/Update/{id}")
	
	public ResponseEntity<User> update(@PathVariable Integer id,@RequestBody User user){
    	 
    	 
    	  User user1 = userservice.update(id, user);
		
		
		   
		return ResponseEntity.ok().body(user1);
		
		
		
	}
	
	
	
}
