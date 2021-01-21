package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Employe;
import com.example.demo.entity.Entreprise;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

	@Autowired
	EntrepriseRepository entrepriseRepository;
	  @Autowired
	private DepartementRepository departementRepository;
	@Override
	public int ajouterEntreprise(Entreprise entreprise) {
		return entrepriseRepository.save(entreprise).getId();
	}

	@Override
	public int ajouterDepartement(Departement dep) {
	return	departementRepository.save(dep).getId();
	}

	@Override
	public void affecterDepartementAEntreprise(int depId, int entrepriseId) {
		Entreprise entreprise = entrepriseRepository.findById(entrepriseId).get();
		Departement departement = departementRepository.findById(depId).get();
		if (!ObjectUtils.isEmpty(entreprise) && !ObjectUtils.isEmpty(departement))
			entreprise.getDepartements().add(departement);
		
		
	}

	@Override
	public List<String> getAllDepartementsNamesByEntreprise(int entrepriseId) {
		Entreprise entreprise = entrepriseRepository.findById(entrepriseId).get();
		ArrayList list =	new ArrayList<String>();
		if (!ObjectUtils.isEmpty(entreprise) )
			for (Departement dep : entreprise.getDepartements()) {
				list.add(dep.getName());
			}
				return list;
	}

}
