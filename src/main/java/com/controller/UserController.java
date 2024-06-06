package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController


public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	{
		System.out.println(user);
		return userService.addUser(user);
	}
	
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id")int id)
	{
		return userService.getUser(id);
		
	}
	
	@GetMapping("/getAllUsers")
	 public List<User> getAllUser()
	 {
	        List<User> userlist=userService.getAllUser();
	        return userlist;
	 }

	 @PutMapping("/updateUser")
	  public ResponseEntity<String> updateUser(@RequestBody User user) 
	 {
		    userService.updateUser(user);
	        return ResponseEntity.ok("User updated successfully.");
	   }

	 @DeleteMapping("/deleteUser/{id}")
	 public ResponseEntity<String> deleteUser(@PathVariable int id) 
	 {
		 userService.deleteUser(id);
	     return ResponseEntity.ok("User deleted successfully.");
	 }
	
	}


