package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	
	User addUser(User user);
	User getUser(int id);
    List<User> getAllUser();
    
    void updateUser(User user);
    
    void deleteUser(int userId);



}
