package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Employe;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.service.EmployeServiceImpl;

@RestController
public class DepartementController {
	
	  @Autowired
     DepartementRepository departementRepository;
	  
	  @Autowired
	  EmployeServiceImpl employeServiceImpl;
	  


	  	@RequestMapping(value = "/departement")
	   public List<Departement>index() {
	  		return (List<Departement>) departementRepository.findAll();
	   }

	    @RequestMapping(value = "/departement", method = RequestMethod.POST)
	 	public void add(@RequestBody Departement departement) {  		
	    	departementRepository.save(departement);
		}
	    
		@RequestMapping(value = "/departement/{employeId}/{depId}", method = RequestMethod.POST)
		public void affecterEmployeADepartement(@PathVariable int employeId,@PathVariable int depId) {
			employeServiceImpl.affecterEmployeADepartement( employeId,  depId);

		}
 }
