package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Entreprise")
public class Entreprise implements Serializable {
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public Set<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(Set<Departement> departements) {
		this.departements = departements;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	int id;

	@Column(name="name")
	String name;
	
	@Column(name="raisonSocial")
	String raisonSocial;
 
	@OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
	private Set<Departement> departements;
  
}
