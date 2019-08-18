package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Formation;

public interface FormationMetier {

	public Formation saveFormation(Formation f);

	public List<Formation> listFormation();

	public Optional<Formation> findFormation(int idFormation);

	public void deleteFormation(int idFormation);

	public Formation updateFormation(Formation newFormation, int idFormation);
}
