package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/user")
public class MyController {
 
	@Autowired
  UserService 	userser;
	
	@GetMapping("/users")
	public List<User> getAll()
	{   
		
		return userser.getAll();
	}
	
	@GetMapping("/user/{id}")
	public User  getUser(@PathVariable("id") int id)
	{
		return  userser.getUser(id);
	}
	
	@PostMapping("/create")
	  public void creteUser(@RequestBody User user)
	{
		 userser.create(user);
		}
}
