package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.FormationRepository;
import com.TCreative.entities.Formation;

@Service
public class FormationMetierImpl implements FormationMetier {

	@Autowired
	private FormationRepository formationRepository;

	@Override
	public Formation saveFormation(Formation f) {
		// TODO Auto-generated method stub
		return formationRepository.save(f);
	}

	@Override
	public List<Formation> listFormation() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	@Override
	public Optional<Formation> findFormation(int idFormation) {
		// TODO Auto-generated method stub
		return formationRepository.findById(idFormation);
	}

	@Override
	public void deleteFormation(int idFormation) {
		// TODO Auto-generated method stub
		formationRepository.deleteById(idFormation);
	}

	@Override
	public Formation updateFormation(Formation newFormation) {
		// TODO Auto-generated method stub
		return formationRepository.save(newFormation);

         }

}
