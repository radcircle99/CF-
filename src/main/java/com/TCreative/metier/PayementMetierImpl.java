package com.TCreative.metier;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.PayementRepository;
import com.TCreative.entities.Payement;

@Service
public class PayementMetierImpl implements PayementMetier {

	@Autowired
	private PayementRepository payementRepository;

	@Override
	public Payement savePayement(Payement p) {
		// TODO Auto-generated method stub
		p.setDatePayement(new Date());
		return payementRepository.save(p);
	}

	@Override
	public List<Payement> listPayement() {
		// TODO Auto-generated method stub
		return payementRepository.findAll();
	}

	@Override
	public Optional<Payement> findPayement(int idPayement) {
		// TODO Auto-generated method stub
		return payementRepository.findById(idPayement);
	}

	@Override
	public void deletePayement(int idPayement) {
		// TODO Auto-generated method stub
		payementRepository.deleteById(idPayement);
	}

	@Override
	public Payement updatePayement(Payement newPayement, int idPayement) {
		// TODO Auto-generated method stub
		return payementRepository.findById(idPayement).map(p -> {
			if (newPayement.getDatePayement() != null)
				p.setDatePayement(newPayement.getDatePayement());
			if (newPayement.getMoisPayer() != null)
				p.setMoisPayer(newPayement.getMoisPayer());
			if (newPayement.getEtudiant() != null)
				p.setEtudiant(newPayement.getEtudiant());
			return payementRepository.save(p);
		}).orElseGet(() -> {
			newPayement.setIdPayement(idPayement);
			return payementRepository.save(newPayement);
		});
	}

}
