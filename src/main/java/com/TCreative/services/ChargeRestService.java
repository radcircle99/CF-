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

import com.TCreative.entities.Charge;
import com.TCreative.metier.ChargeMetier;

@RestController
public class ChargeRestService {

	@Autowired
	private ChargeMetier chargeMetier;

	@RequestMapping(value = "/charges", method = RequestMethod.POST)
	public Charge saveCharge(@RequestBody Charge c) {
		return chargeMetier.saveCharge(c);
	}

	@RequestMapping(value = "/charges", method = RequestMethod.GET)
	public List<Charge> listCharge() {
		return chargeMetier.listCharge();
	}

	@DeleteMapping(value = "/charges/{idCharge}")
	public void deleteCharge(@PathVariable int idCharge) {
		chargeMetier.deleteCharge(idCharge);
	}

	@PutMapping(value = "/charges/{idCharge}")
	public Charge updateCharge(@RequestBody Charge c, @PathVariable int idCharge) {
		return chargeMetier.updateCharge(c, idCharge);
	}

	@RequestMapping(value = "/charges/{idCharge}", method = RequestMethod.GET)
	public Optional<Charge> findCharge(@PathVariable int idCharge) {
		return chargeMetier.findCharge(idCharge);
	}

}
