package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="EMPL_ID")
	private long id; // Clé primaire
	
	@Column(name="LastName")
	private String LastName;
	
	@Column(name="FirstName")
	private String FirstName;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	public long getId() {
		return this.id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return this.LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public String getFirstName() {
		return this.FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
