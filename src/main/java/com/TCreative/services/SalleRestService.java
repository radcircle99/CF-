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

import com.TCreative.entities.Salle;
import com.TCreative.metier.SalleMetier;

@RestController
@CrossOrigin(origins ="http://localhost:4200") 
public class SalleRestService {

	@Autowired
	private SalleMetier salleMetier;

	@RequestMapping(value = "/salles", method = RequestMethod.POST)
	public Salle saveSalle(@RequestBody Salle s) {
		return salleMetier.saveSalle(s);
	}

	@RequestMapping(value = "/salles", method = RequestMethod.GET)
	public List<Salle> listSalle() {
		return salleMetier.listSalle();
	}

	@DeleteMapping(value = "/salles/{idSalle}")
	public void deleteSalle(@PathVariable int idSalle) {
		salleMetier.deleteSalle(idSalle);
	}

	@PutMapping(value = "/salles")
	public Salle updateSalle(@RequestBody Salle newSalle) {
		return salleMetier.updateSalle(newSalle);
	}

	@RequestMapping(value = "/salles/{idSalle}", method = RequestMethod.GET)
	public Optional<Salle> findsalle(@PathVariable int idSalle) {
		return salleMetier.findsalle(idSalle);
	}

}
