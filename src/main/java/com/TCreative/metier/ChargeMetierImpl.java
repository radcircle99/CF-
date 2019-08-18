package com.TCreative.metier;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.ChargeRepository;
import com.TCreative.entities.Charge;

@Service
public class ChargeMetierImpl implements ChargeMetier {

	@Autowired
	private ChargeRepository chargeRepository;

	@Override
	public Charge saveCharge(Charge c) {
		// TODO Auto-generated method stub
		c.setDateCharge(new Date());
		return chargeRepository.save(c);
	}

	@Override
	public List<Charge> listCharge() {
		// TODO Auto-generated method stub
		return chargeRepository.findAll();
	}

	@Override
	public void deleteCharge(int idCharge) {
		// TODO Auto-generated method stub
		chargeRepository.deleteById(idCharge);
	}

	@Override
	public Charge updateCharge(Charge newCharge, int idCharge) {
		// TODO Auto-generated method stub
		return chargeRepository.findById(idCharge).map(c -> {
			if (newCharge.getNomCharge() != null)
				c.setNomCharge(newCharge.getNomCharge());
			if (newCharge.getMontantCharge() != 0)
				c.setMontantCharge(newCharge.getMontantCharge());
			if (newCharge.getTypeCharge() != null)
				c.setTypeCharge(newCharge.getTypeCharge());
			if (newCharge.getDateCharge() != null)
				c.setDateCharge(newCharge.getDateCharge());
			return chargeRepository.save(c);
		}).orElseGet(() -> {
			newCharge.setIdCharge(idCharge);
			return chargeRepository.save(newCharge);
		});
	}

	@Override
	public Optional<Charge> findCharge(int idCharge) {
		// TODO Auto-generated method stub
		return chargeRepository.findById(idCharge);
	}

}
