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
public class Formation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFomartion;
	private String nomFormation;
	private String typeFormation;
	private Date dateDebut;
	private String dureeFomation;
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

	public Formation(String nomFormation, String typeFormation, Date dateDebut, String dureeFomation) {
		super();
		this.nomFormation = nomFormation;
		this.typeFormation = typeFormation;
		this.dateDebut = dateDebut;
		this.dureeFomation = dureeFomation;
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

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDureeFomation() {
		return dureeFomation;
	}

	public void setDureeFomation(String dureeFomation) {
		this.dureeFomation = dureeFomation;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public Personne getPer() {
		return personne;
	}

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
