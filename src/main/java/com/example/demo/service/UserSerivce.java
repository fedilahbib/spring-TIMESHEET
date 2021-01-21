package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

public interface UserSerivce {

	
	public List<User> retrieveAllUsers();
	public User addUser(User u) ;
	
	//List<User> retrieveAllUsers(); 
	//User addUser(User u);
	//void deleteUser(Long id);
		//void deleteUser(String id);
	/*User updateUser(User u);
	List<User> findByIdGreaterThan(int id);
	User retrieveUser(Long id);
	User retrieveUser(String id);
	List<User> findByFirstName(String fname);
	List<User> findByLastName(String lname);*/
}
