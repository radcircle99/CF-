package com.TCreative.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Charge implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCharge;
	private String nomCharge;
	private String typeCharge;
	private Date dateCharge;
	private float montantCharge;

	public Charge() {
		super();
	}

	public Charge(String nomCharge, float montantCharge) {
		super();
		this.nomCharge = nomCharge;
		this.montantCharge = montantCharge;
	}

	public int getIdCharge() {
		return idCharge;
	}

	public void setIdCharge(int idCharge) {
		this.idCharge = idCharge;
	}

	public String getNomCharge() {
		return nomCharge;
	}

	public void setNomCharge(String nomCharge) {
		this.nomCharge = nomCharge;
	}

	public float getMontantCharge() {
		return montantCharge;
	}

	public void setMontantCharge(float montantCharge) {
		this.montantCharge = montantCharge;
	}

	public String getTypeCharge() {
		return typeCharge;
	}

	public void setTypeCharge(String typeCharge) {
		this.typeCharge = typeCharge;
	}

	public Date getDateCharge() {
		return dateCharge;
	}

	public void setDateCharge(Date dateCharge) {
		this.dateCharge = dateCharge;
	}

}
