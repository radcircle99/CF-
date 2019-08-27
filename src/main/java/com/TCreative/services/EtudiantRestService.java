package com.TCreative.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TCreative.entities.Etudiant;
import com.TCreative.metier.EtudiantMetier;

@RestController
@CrossOrigin(origins ="http://localhost:4200") 
public class EtudiantRestService {

	@Autowired
	private EtudiantMetier etudiantMetier;

	@RequestMapping(value = "/etudiants", method = RequestMethod.POST)
	public Etudiant saveEtudiant(@RequestBody Etudiant e) {
		return etudiantMetier.saveEtudiant(e);
	}

	@RequestMapping(value = "/etudiants", method = RequestMethod.GET)
	public List<Etudiant> listEtudiant() {
		return etudiantMetier.listEtudiant();
	}
	
	@RequestMapping(value = "/etudiants", method = RequestMethod.PUT)
	public Etudiant updateEtudiant(@RequestBody Etudiant e) {
		// TODO Auto-generated method stub
		return etudiantMetier.updateEtudiant(e);
		
	}

	@RequestMapping(value = "/etudiants/{idPer}", method = RequestMethod.GET)
	public Optional<Etudiant> findEtudiant(@PathVariable int idPer) {
		return etudiantMetier.findEtudiant(idPer);
	}
	

	@RequestMapping(value = "/etudiants/{idPer}", method = RequestMethod.DELETE)
	public void deleteEtudiant(@PathVariable int idPer) {
		etudiantMetier.deleteEtudiant(idPer);
	}
/*	@RequestMapping(value = "/etudiants", method = RequestMethod.PUT)
	public Etudiant updateEtudiant(@RequestBody Etudiant e) {
		return etudiantMetier.updateEtudiant(e);*

	}*/
}
