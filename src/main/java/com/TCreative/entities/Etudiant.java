package com.TCreative.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Etudiant extends Personne {

	@Column(nullable = true)
	private String photoEtud;
	@Column(nullable = true)
	private Date dateNaissance;
	@Column(nullable = true)
	private Date dateInscription;
	@Column(nullable = true)
	private float montantPayer;
	@Column(nullable = true)
	private String dernierMoisPayer;
	@OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
	private Collection<Payement> payements;

	public Etudiant() {
		super();
	}

	public Etudiant(String nomPer, String prenomPer) {
		super(nomPer, prenomPer);
	}

	public String getPhotoEtud() {
		return photoEtud;
	}

	public void setPhotoEtud(String photoEtud) {
		this.photoEtud = photoEtud;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public float getMontantPayer() {
		return montantPayer;
	}

	public void setMontantPayer(float montantPayer) {
		this.montantPayer = montantPayer;
	}

	public String getDernierMoisPayer() {
		return dernierMoisPayer;
	}

	public void setDernierMoisPayer(String dernierMoisPayer) {
		this.dernierMoisPayer = dernierMoisPayer;
	}

}
