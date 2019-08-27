package com.TCreative.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TCreative.entities.Etudiant;
import com.TCreative.entities.Formation;
import com.TCreative.metier.FormationMetier;

@RestController
@CrossOrigin(origins ="http://localhost:4200") 
public class FormationRestService {

	@Autowired
	private FormationMetier formationMetier;

	@RequestMapping(value = "/formations", method = RequestMethod.POST)
	public Formation saveFormation(@RequestBody Formation f) {
		return formationMetier.saveFormation(f);
	}

	@RequestMapping(value = "/formations", method = RequestMethod.GET)
	public List<Formation> listFormation() {
		return formationMetier.listFormation();
	}

	@RequestMapping(value = "/formations/{idFormation}", method = RequestMethod.GET)
	public Optional<Formation> findFormation(@PathVariable int idFormation) {
		return formationMetier.findFormation(idFormation);
	}

	@RequestMapping(value = "/formations", method = RequestMethod.PUT)
	public Formation updateFormation(@RequestBody Formation newFormation) {
		// TODO Auto-generated method stub
		return formationMetier.updateFormation(newFormation);
	}
	
	@RequestMapping(value = "/formations/{idFormation}", method = RequestMethod.DELETE)
	public void deleteFormation(@PathVariable int idFormation) {
		formationMetier.deleteFormation(idFormation);
	}

}
