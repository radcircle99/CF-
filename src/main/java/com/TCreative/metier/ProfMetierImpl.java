package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.ProfRepository;
import com.TCreative.entities.Prof;

@Service
public class ProfMetierImpl implements ProfMetier {

	@Autowired
	private ProfRepository profRepository;

	@Override
	public Prof saveProf(Prof p) {
		// TODO Auto-generated method stub
		return profRepository.save(p);
	}

	@Override
	public List<Prof> listProf() {
		// TODO Auto-generated method stub
		return profRepository.findAll();
	}

	@Override
	public Optional<Prof> findProf(int idPer) {
		// TODO Auto-generated method stub
		return profRepository.findById(idPer);
	}

	@Override
	public void deleteProf(int idPer) {
		// TODO Auto-generated method stub
		profRepository.deleteById(idPer);
		;
	}

	@Override
	public Prof updateProf(Prof newProf) {
		
			return profRepository.save(newProf);
		}
	

	

}
