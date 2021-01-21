package com.example.demo.entity;


import javax.persistence.*;

@Entity
@DiscriminatorValue("MissionExterne")
public class MissionExterne extends Mission {


	@Column(name="emailFacturation")
	String emailFacturation;

	@Column(name="tauxJournalierMoyen")
	String tauxJournalierMoyen;

	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public String getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}

	public void setTauxJournalierMoyen(String tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}
}
