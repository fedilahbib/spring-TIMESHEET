package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;



@Service

public class UserServiceImpl implements UserSerivce{


	@Autowired
    private UserRepository userRepository;

	public List<User> retrieveAllUsers(){
return (List<User>) userRepository.findAll();

		
		
	}
	public User addUser(User u) {
		return userRepository.save(u);
	}
}
