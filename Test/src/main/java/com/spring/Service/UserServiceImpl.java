package com.spring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.Model.User;
import com.spring.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository obj;
	
	@Override
public User login(String username,String password) {
		
		
		User user = obj.findByUsername(username);
		
		  
		
		if (user == null) { 
			throw new RuntimeException("You entered incorrect username.");
		} else {
			if (user.getUserpwd().equals(password)) {//true
				return user;
			}
			throw new RuntimeException("You entered incorrect password.");
		}
		
		
		
		
	}

	@Override
	public User save(User user) {
	     return    obj.save(user);
		
	}

	@Override
	public User update(int id, User user) {
		
		if(obj.existsById(id)) {
			User user1=obj.getById(id);
			   if(user.getFirstName()!=null)  { 
			user1.setFirstName(user.getFirstName());
			   }
			   
			   if(user.getLastName()!=null) {
		user1.setLastName(user.getLastName());
			   }
			   if(user.getUserEmail()!=null)  { 
					user1.setUserEmail(user.getUserEmail());
			   }
			   
			   if(user.getGender()!=null)  { 
					user1.setGender(user.getGender());
					   }
			   if(user.getUsername()!=null)  { 
					user1.setUsername(user.getUsername());
					   }
			   
			   if(user.getUserpwd()!=null)  { 
					user1.setUserpwd(user.getUserpwd());
					   }
			   if(user.getUserAge()!=null)  { 
					user1.setUserAge(user.getUserAge());
					   }
					   
			
			return obj.save(user1);
		}
			return obj.save(user);
	}

}
