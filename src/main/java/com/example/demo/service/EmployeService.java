package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contrat;
import com.example.demo.entity.Employe;
import com.example.demo.repository.EmployeRepository;

public interface  EmployeService {

	
	  public int ajouterEmploye(Employe employe);
	  public void affecterEmployeADepartement(int employeId, int depId);
	  public int ajouterContrat(Contrat contrat);
	  public void affecterContratAEmploye(int contratId, int employeId);
	  public String getEmployePrenomById(int employeId);
	  public long getNombreEmployeJPQL();
	  public List<String> getAllEmployeNamesJPQL();
}
