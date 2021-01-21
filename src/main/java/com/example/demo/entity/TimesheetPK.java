package com.example.demo.entity;

import java.io.Serializable;

public class TimesheetPK implements Serializable{

	
	private Employe employes;
	   
  
	private Mission mission;


	public Employe getEmployes() {
		return employes;
	}


	public void setEmployes(Employe employes) {
		this.employes = employes;
	}


	public Mission getMission() {
		return mission;
	}


	public void setMission(Mission mission) {
		this.mission = mission;
	}


	public TimesheetPK(Employe employes, Mission mission) {
		super();
		this.employes = employes;
		this.mission = mission;
	}
   
}
