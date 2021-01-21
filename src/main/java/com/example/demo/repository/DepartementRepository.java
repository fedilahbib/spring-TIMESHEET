package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Mission;
 
@Repository
public interface DepartementRepository  extends CrudRepository<Departement,Integer> {
 
		 

}
