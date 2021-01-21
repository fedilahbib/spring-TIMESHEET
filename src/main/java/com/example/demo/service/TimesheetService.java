package com.example.demo.service;

import java.util.Date;

import com.example.demo.entity.Mission;

public interface TimesheetService {

	public int ajouterMission(Mission mission);
	 public void affecterMissionADepartement(int missionId, int depId);
	  public void ajouterTimesheet(int missionId, int employeId, Date dateDebut, Date dateFin);
}
