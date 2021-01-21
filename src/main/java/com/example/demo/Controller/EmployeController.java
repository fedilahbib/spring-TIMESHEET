package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employe;
import com.example.demo.repository.EmployeRepository;
import com.example.demo.service.EmployeService;

@RestController
public class EmployeController {

	  @Autowired
	  private EmployeRepository employeRepository;


	  	@RequestMapping(value = "/employe")
	   public List<Employe>index() {
	  		return (List<Employe>) employeRepository.findAll();
	   }
 
 	    @RequestMapping(value = "/employe", method = RequestMethod.POST)
	 	public void add(@RequestBody Employe employe) {  		
 	    	  employeRepository.save(employe);
		}
	 

}
