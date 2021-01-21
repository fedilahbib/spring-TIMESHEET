package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="Timesheet")
@IdClass(TimesheetPK.class)
public class Timesheet implements Serializable {

	@Id
	private Employe employes;

	@ManyToOne
    @JoinColumn(name="idMission",referencedColumnName="id",insertable=false,updatable=false)
    @Id
	private Mission mission;
	
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	
	public Date getDateDebut() {
		return dateDebut;
	}

	public Timesheet(Employe employes, Mission mission, Date dateFin, Date dateDebut) {
		super();
		this.employes = employes;
		this.mission = mission;
		this.dateFin = dateFin;
		this.dateDebut = dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Column(name="isValide")
	private boolean isValide;
	
	@ManyToOne
    @JoinColumn(name="idEmploye",referencedColumnName="id",insertable=false,updatable=false)

   
    public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isValide() {
		return isValide;
	}

	public void setValide(boolean isValide) {
		this.isValide = isValide;
	}

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

   
}
