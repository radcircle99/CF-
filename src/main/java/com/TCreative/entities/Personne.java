package com.TCreative.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int idPer;
	@Column(nullable = false)
	private String nomPer;
	@Column(nullable = false)
	private String prenomPer;
	@Column(nullable = true)
	private String adressePer;
	@Column(nullable = true, length = 10)
	private int telPer;
	@OneToMany(mappedBy = "personne", fetch = FetchType.LAZY)
	private Collection<Formation> formations;

	public Personne() {
		super();
	}

	public Personne(String nomPer, String prenomPer) {
		super();
		this.nomPer = nomPer;
		this.prenomPer = prenomPer;
	}

	public int getIdPer() {
		return idPer;
	}

	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}

	public String getNomPer() {
		return nomPer;
	}

	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}

	public String getPrenomPer() {
		return prenomPer;
	}

	public void setPrenomPer(String prenomPer) {
		this.prenomPer = prenomPer;
	}

	public String getAdressePer() {
		return adressePer;
	}

	public void setAdressePer(String adressePer) {
		this.adressePer = adressePer;
	}

	public int getTelPer() {
		return telPer;
	}

	public void setTelPer(int telPer) {
		this.telPer = telPer;
	}

	@JsonIgnore
	public Collection<Formation> getFormations() {
		return formations;
	}

	@JsonSetter
	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}

}
