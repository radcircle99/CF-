package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.SalleRepository;
import com.TCreative.entities.Salle;

@Service
public class SalleMetierImpl implements SalleMetier {

	@Autowired
	private SalleRepository salleRepository;

	@Override
	public Salle saveSalle(Salle s) {
		// TODO Auto-generated method stub
		return salleRepository.save(s);
	}

	@Override
	public List<Salle> listSalle() {
		// TODO Auto-generated method stub
		return salleRepository.findAll();
	}

	@Override
	public void deleteSalle(int idSalle) {
		// TODO Auto-generated method stub
		salleRepository.deleteById(idSalle);
	}

	@Override
	public Salle updateSalle(Salle newSalle) {
		// TODO Auto-generated method stub
	
			return salleRepository.save(newSalle);
		}
	

	@Override
	public Optional<Salle> findsalle(int idSalle) {
		// TODO Auto-generated method stub
		return salleRepository.findById(idSalle);
	}

}
