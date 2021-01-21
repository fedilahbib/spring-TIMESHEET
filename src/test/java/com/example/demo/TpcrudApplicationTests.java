package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.service.UserSerivce;
import com.example.demo.service.UserServiceImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootTest
class TpcrudApplicationTests {

    private static final Logger logger = LogManager.getLogger(TpcrudApplicationTests.class);

	@Autowired
	UserServiceImpl userServiceImpl;
	
	@Test
	void contextLoads() {
logger.info(userServiceImpl.retrieveAllUsers());	
	}

}
