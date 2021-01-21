package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.*;
@Entity
@Table(name="Contrat")
public class Contrat implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="reference")
	private int reference;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Column(name="typeContrat")
	private String typeContrat;
	@Column(name="salaire")
	private int salaire;
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public String getTypeContrat() {
		return typeContrat;
	}
	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}
	public int getSalaire() {
		return salaire;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	@OneToOne
	private Employe employe;
	 
}
