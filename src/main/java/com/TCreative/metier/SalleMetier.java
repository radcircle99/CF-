package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Salle;

public interface SalleMetier {

	public Salle saveSalle(Salle s);

	public List<Salle> listSalle();

	public Optional<Salle> findsalle(int idSalle);

	public void deleteSalle(int idSalle);

	public Salle updateSalle(Salle newSalle);
}
