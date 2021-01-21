package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employe;
import com.example.demo.entity.Entreprise;
import com.example.demo.repository.EmployeRepository;
import com.example.demo.repository.EntrepriseRepository;

@RestController
public class EntrepriseController {

	@Autowired
	private EntrepriseRepository entrepriseRepository;
	
  	@RequestMapping(value = "/entreprise")
   public List<Entreprise>index() {
  		return (List<Entreprise>) entrepriseRepository.findAll();
   }

	@RequestMapping(value = "/entreprise", method = RequestMethod.POST)
 	public void add(@RequestBody Entreprise entreprise) {  		
	    	entrepriseRepository.save(entreprise);
	}
}
