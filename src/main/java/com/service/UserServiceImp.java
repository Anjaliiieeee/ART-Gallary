package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserRepository;
import com.model.User;

@Service

public class UserServiceImp implements UserService {

	@Autowired
	UserRepository userRepo;
		
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);

	}

	@Override
	public User getUser(int id) {
		return userRepo.findById(id).orElse(null);

	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();

	}

	@Override
	public void updateUser(User user) {
		 userRepo.save(user);

	}

	@Override
	public void deleteUser(int userId) {
        userRepo.deleteById(userId);

	}

}
