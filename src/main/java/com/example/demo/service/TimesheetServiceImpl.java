package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Employe;
import com.example.demo.entity.Entreprise;
import com.example.demo.entity.Mission;
import com.example.demo.entity.Timesheet;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.EmployeRepository;
import com.example.demo.repository.MissionRepository;
import com.example.demo.repository.TimesheetRepository;

@Service
public class TimesheetServiceImpl implements TimesheetService {
	@Autowired
	private TimesheetRepository timesheetRepository;
	@Autowired
	private MissionRepository missionRepository;
	  @Autowired
		 private EmployeRepository employeRepository;
	@Autowired
	private DepartementRepository departementRepository;
	@Override
	public int ajouterMission(Mission mission) {
		// TODO Auto-generated method stub
		return missionRepository.save(mission).getId();
	}

	@Override
	public void affecterMissionADepartement(int missionId, int depId) {
		Mission mission = missionRepository.findById(missionId).get();
		Departement departement = departementRepository.findById(depId).get();
		if (!ObjectUtils.isEmpty(mission) && !ObjectUtils.isEmpty(departement))
			departement.getMissions().add(mission);
		
			
	}

	@Override
	public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin) {
		Employe employe = employeRepository.findById(employeId).get();
		Mission mission = missionRepository.findById(missionId).get();
		
		if (!ObjectUtils.isEmpty(mission) && !ObjectUtils.isEmpty(employe))
		{Timesheet timesheet=new Timesheet(employe,mission, dateFin ,dateDebut);
		timesheetRepository.save(timesheet);
		}

	}

}
