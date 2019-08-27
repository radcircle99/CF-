package com.TCreative.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Formation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFomartion;
	private String nomFormation;
	private String typeFormation;
	private String dateDebut;
	private String dureeFormation;
	@ManyToOne
	@JoinColumn(name = "idSalle")
	private Salle salle;
	@ManyToOne
	@JoinColumn(name = "idProf")
	private Personne personne;
	// @OneToMany(mappedBy = "formation",fetch = FetchType.LAZY)
	// private Collection<Etudiant> etudiants;

	public Formation() {
		super();
	}

	public Formation(String nomFormation, String typeFormation, String dateDebut, String dureeFomation) {
		super();
		this.nomFormation = nomFormation;
		this.typeFormation = typeFormation;
		this.dateDebut = dateDebut;
		this.dureeFormation = dureeFomation;
	}

	public int getIdFomartion() {
		return idFomartion;
	}

	public void setIdFomartion(int idFomartion) {
		this.idFomartion = idFomartion;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

	public String getTypeFormation() {
		return typeFormation;
	}

	public void setTypeFormation(String typeFormation) {
		this.typeFormation = typeFormation;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDureeFomation() {
		return dureeFormation;
	}

	public void setDureeFomation(String dureeFomation) {
		this.dureeFormation = dureeFomation;
	}

	@JsonIgnore
	public Salle getSalle() {
		return salle;
	}
	
	@JsonSetter
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	
	@JsonIgnore
	public Personne getPer() {
		return personne;
	}

	@JsonSetter
	public void setPer(Personne per) {
		this.personne = per;
	}

	/*
	 * @JsonIgnore public Collection<Etudiant> getEtudiants() { return etudiants; }
	 * 
	 * @JsonSetter public void setEtudiants(Collection<Etudiant> etudiants) {
	 * this.etudiants = etudiants; }
	 * 
	 */
}
