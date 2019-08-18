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

import com.TCreative.entities.Payement;
import com.TCreative.metier.PayementMetier;

@RestController
public class PayementRestService {

	@Autowired
	private PayementMetier payementMetier;

	@RequestMapping(value = "/payements", method = RequestMethod.POST)
	public Payement savePayement(@RequestBody Payement p) {
		return payementMetier.savePayement(p);
	}

	@RequestMapping(value = "/payements", method = RequestMethod.GET)
	public List<Payement> listPayement() {
		return payementMetier.listPayement();
	}

	@RequestMapping(value = "/payements/{idPayement}", method = RequestMethod.GET)
	public Optional<Payement> findPayement(@PathVariable int idPayement) {
		return payementMetier.findPayement(idPayement);
	}

	@DeleteMapping(value = "/payements/{idPayement}")
	public void deletePayement(@PathVariable int idPayement) {
		payementMetier.deletePayement(idPayement);
	}

	@PutMapping(value = "/payements/{idPayement}")
	public Payement updatePayement(@RequestBody Payement p, @PathVariable int idPayement) {
		return payementMetier.updatePayement(p, idPayement);
	}
}
