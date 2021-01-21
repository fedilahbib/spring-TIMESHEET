package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mission;

@Repository
public interface MissionRepository  extends CrudRepository<Mission,Integer> {

}
