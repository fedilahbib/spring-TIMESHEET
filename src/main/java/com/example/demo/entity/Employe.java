package com.example.demo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Employe")
public class Employe implements Serializable {


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenon() {
		return prenon;
	}

	public void setPrenon(String prenon) {
		this.prenon = prenon;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActif() {
		return isActif;
	}

	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public Set<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}

	public Set<Timesheet> getTimesheets() {
		return timesheets;
	}

	public void setTimesheets(Set<Timesheet> timesheets) {
		this.timesheets = timesheets;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="prenon")
	private String prenon;
	
	@Column(name="nom")
	private 	String nom;
	
	@Column(name="email")
	private 	String email;
	
	@Column(name="isActif")
	private 	boolean isActif;

	@Enumerated(EnumType.STRING)
	private Role role;
	 
	@OneToOne(mappedBy="employe")
	private Contrat contrat;

	@ManyToMany(mappedBy="employes", cascade = CascadeType.ALL)
	private Set<Departement> departements;
	 
	@OneToMany(mappedBy="employes", cascade = CascadeType.ALL)
	private Set<Timesheet> timesheets;
	
}

