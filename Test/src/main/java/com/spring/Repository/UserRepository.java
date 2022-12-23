package com.spring.Repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.Model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Serializable> {


public User findByUsername(String username);

public User getById(int id);

}
