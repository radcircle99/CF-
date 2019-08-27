package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Prof;

public interface ProfMetier {

	public Prof saveProf(Prof p);

	public List<Prof> listProf();

	public Optional<Prof> findProf(int idPer);

	public void deleteProf(int idPer);

	public Prof updateProf(Prof newProf);


}
