package com.TCreative.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TCreative.entities.Formation;
import com.TCreative.metier.FormationMetier;

@RestController
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

	@DeleteMapping(value = "/formations/{idFormation}")
	public void deleteFormation(@PathVariable int idFormation) {
		formationMetier.deleteFormation(idFormation);
	}

	@PutMapping(value = "/formations/{idFormation}")
	public Formation updateFormation(@RequestBody Formation newFormation, @PathVariable int idFormation) {
		return formationMetier.updateFormation(newFormation, idFormation);
	}

}
