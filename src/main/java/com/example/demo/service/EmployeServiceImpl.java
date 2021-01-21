package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.entity.Contrat;
import com.example.demo.entity.Departement;
import com.example.demo.entity.Employe;
import com.example.demo.repository.ContratRepository;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeService {

	  @Autowired
	 private EmployeRepository employeRepository;
	  @Autowired
	private DepartementRepository departementRepository;
	  @Autowired
	private  ContratRepository contratRepository;
	@Override
	public int ajouterEmploye(Employe employe) {
		
		employeRepository.save(employe);
		return  employe.getId();
	}

	@Override
	public void affecterEmployeADepartement(int employeId, int depId) {
		Employe employe = employeRepository.findById(employeId).get();
		Departement departement = departementRepository.findById(depId).get();
		if (!ObjectUtils.isEmpty(employe) && !ObjectUtils.isEmpty(departement))
			departement.getEmployes().add(employe);
	}

	@Override
	public int ajouterContrat(Contrat contrat) {
	return	 contratRepository.save(contrat).getReference();
	}

	@Override
	public void affecterContratAEmploye(int contratId, int employeId) {
		
		Employe employe = employeRepository.findById(employeId).get();
		Contrat contrat = contratRepository.findById(contratId).get();
		if (!ObjectUtils.isEmpty(employe) && !ObjectUtils.isEmpty(contrat))
			contrat.setEmploye(employe);
		
	}

	@Override
	public String getEmployePrenomById(int employeId) {

		Employe employe = employeRepository.findById(employeId).get();
		if (ObjectUtils.isEmpty(employe) )
			return employe.getPrenon();
		
		return null;
	}

	@Override
	public long getNombreEmployeJPQL() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getAllEmployeNamesJPQL() {
		// TODO Auto-generated method stub
		return null;
	}

}
