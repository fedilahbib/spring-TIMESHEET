package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employe;
import com.example.demo.entity.Timesheet;
import com.example.demo.entity.TimesheetPK;


@Repository
public interface TimesheetRepository  extends CrudRepository<Timesheet,TimesheetPK>{

}
