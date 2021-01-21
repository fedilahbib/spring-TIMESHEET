package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;



public class UserServiceImpl implements UserSerivce{


	@Autowired
    private UserRepository userRepository;

	public List<User> retrieveAllUsers(){
		return (List<User>) userRepository.findAll();
		
		
	}
	public User addUser(User u) {
		return userRepository.addUser(u);
	}
}
