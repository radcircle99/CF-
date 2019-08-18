package com.TCreative.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Salle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSalle;
	@Column(length = 2)
	private int numeroSalle;
	@Column(length = 3)
	private int capaciteSalle;
	@OneToMany(mappedBy = "salle", fetch = FetchType.LAZY)
	private Collection<Formation> formations;

	public Salle() {
		super();
	}

	public Salle(int numeroSalle, int capaciteSalle) {
		super();
		this.numeroSalle = numeroSalle;
		this.capaciteSalle = capaciteSalle;
	}

	public int getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(int idSalle) {
		this.idSalle = idSalle;
	}

	public int getNumeroSalle() {
		return numeroSalle;
	}

	public void setNumeroSalle(int numeroSalle) {
		this.numeroSalle = numeroSalle;
	}

	public int getCapaciteSalle() {
		return capaciteSalle;
	}

	public void setCapaciteSalle(int capaciteSalle) {
		this.capaciteSalle = capaciteSalle;
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
