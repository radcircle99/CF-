package com.TCreative.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Prof extends Personne {

	@Column(nullable = true, length = 2)
	private int pourcentage;
	@Column(nullable = true)
	private float remun;
	@Column(nullable = true)
	private String dernierMoisRemun;

	public Prof() {
		super();
	}

	public Prof(String nomPer, String prenomPer, int pourcentage) {
		super(nomPer, prenomPer);
		this.pourcentage = pourcentage;
	}

	public int getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(int pourcentage) {
		this.pourcentage = pourcentage;
	}

	public float getRemun() {
		return remun;
	}

	public void setRemun(float remun) {
		this.remun = remun;
	}

	public String getDernierMoisRemun() {
		return dernierMoisRemun;
	}

	public void setDernierMoisRemun(String dernierMoisRemun) {
		this.dernierMoisRemun = dernierMoisRemun;
	}

}
