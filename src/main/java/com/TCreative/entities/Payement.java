package com.TCreative.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPayement;
	private String moisPayer;
	private String datePayement;
	@ManyToOne
	@JoinColumn(name = "idEtud")
	private Etudiant etudiant;

	public Payement() {
		super();
	}

	public Payement(String moisPayer, Etudiant etudiant) {
		super();
		this.moisPayer = moisPayer;
		this.etudiant = etudiant;
	}

	public Payement(String moisPayer) {
		super();
		this.moisPayer = moisPayer;
	}

	public int getIdPayement() {
		return idPayement;
	}

	public void setIdPayement(int idPayement) {
		this.idPayement = idPayement;
	}

	public String getMoisPayer() {
		return moisPayer;
	}

	public void setMoisPayer(String moisPayer) {
		this.moisPayer = moisPayer;
	}

	public String getDatePayement() {
		return datePayement;
	}

	public void setDatePayement(String datePayement) {
		this.datePayement = datePayement;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

}
