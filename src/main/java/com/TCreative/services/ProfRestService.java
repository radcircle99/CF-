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

import com.TCreative.entities.Prof;
import com.TCreative.metier.ProfMetier;

@RestController
public class ProfRestService {

	@Autowired
	private ProfMetier profMetier;

	@RequestMapping(value = "/profs", method = RequestMethod.POST)
	public Prof saveProf(@RequestBody Prof p) {
		return profMetier.saveProf(p);
	}

	@RequestMapping(value = "/profs", method = RequestMethod.GET)
	public List<Prof> listProf() {
		return profMetier.listProf();
	}

	@RequestMapping(value = "/profs/{idPer}", method = RequestMethod.GET)
	public Optional<Prof> findProf(@PathVariable int idPer) {
		return profMetier.findProf(idPer);
	}

	@DeleteMapping(value = "/profs/{idPer}")
	public void deleteProf(@PathVariable int idPer) {
		profMetier.deleteProf(idPer);
	}

	@PutMapping(value = "/profs/{idPer}")
	public Prof updateProf(@RequestBody Prof newProf, @PathVariable int idPer) {
		return profMetier.updateProf(newProf, idPer);
	}

	// @PutMapping(value="/profs/{idPer}")
	/*
	 * public Prof updateRemun(Prof p) { return profMetier.updateRemun(p); }
	 */
}
