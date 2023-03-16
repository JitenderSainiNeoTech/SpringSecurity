package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.modal.User;

@Service
public class UserService {
	
	List<User> list = new ArrayList<User>();
	
    UserService()
    {
    	list.add(new User(12,"Rahul","Java"));
    	
    	list.add(new User(13,"Vishal","Teacher"));
    	list.add(new User(14,"Ankur","PostMan"));
    	list.add(new User(150,"Raj","Hawker"));

    }
	
    
    public List<User> getAll()
    {
    	
    	return list;
    }
    
    public User getUser(int id)
    {
    	return list.stream().filter(user-> user.getId()==id).findAny().get();
    }
    
    public void create(User user)
    {
    	list.add(user);
    }

}
