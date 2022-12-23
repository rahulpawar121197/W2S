package com.spring.Service;

import com.spring.Model.User;

public interface UserService {

public 	User login(String username, String password);
public User save(User user);

public User update(int id,User user);
}
