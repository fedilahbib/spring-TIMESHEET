package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Contrat;
import com.example.demo.entity.Departement;


@Repository
public interface ContratRepository  extends CrudRepository<Contrat,Integer> {
	 
}
