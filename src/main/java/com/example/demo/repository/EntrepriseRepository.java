package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employe;
import com.example.demo.entity.Entreprise;


@Repository
public interface EntrepriseRepository  extends CrudRepository<Entreprise,Integer>{

}
