package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Entreprise;

public interface  EntrepriseService {

	public int ajouterEntreprise(Entreprise entreprise);
 public int ajouterDepartement(Departement dep);
	  void affecterDepartementAEntreprise(int depId, int entrepriseId);
  List<String> getAllDepartementsNamesByEntreprise(int entrepriseId);

}
