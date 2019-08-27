package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Etudiant;

public interface EtudiantMetier {

	public Etudiant saveEtudiant(Etudiant e);

	public List<Etudiant> listEtudiant();
	
	public Optional<Etudiant> findEtudiant(int idPer);
	
	public void deleteEtudiant(int idPer);

	public Etudiant updateEtudiant(Etudiant e);

	
//	public Etudiant UpdateEtudiant(Etudiant e);
}
