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
	public Prof updateProf(Prof newProf, int idPer) {
		// TODO Auto-generated method stub
		return profRepository.findById(idPer).map(p -> {
			if (newProf.getNomPer() != null)
				p.setNomPer(newProf.getNomPer());
			if (newProf.getPrenomPer() != null)
				p.setPrenomPer(newProf.getPrenomPer());
			if (newProf.getAdressePer() != null)
				p.setAdressePer(newProf.getAdressePer());
			if (newProf.getTelPer() != 0)
				p.setTelPer(newProf.getTelPer());
			if (newProf.getDernierMoisRemun() != null)
				p.setDernierMoisRemun(newProf.getDernierMoisRemun());
			if (newProf.getPourcentage() != 0)
				p.setPourcentage(newProf.getPourcentage());
			if (newProf.getRemun() != 0)
				p.setRemun(newProf.getRemun());
			return profRepository.save(p);
		}).orElseGet(() -> {
			newProf.setIdPer(idPer);
			return profRepository.save(newProf);
		});
	}

	@Override
	public Prof updateRemun(Prof p) {
		// TODO Auto-generated method stub
		/*
		 * int remun=0; for(Formation f : p.getFormations()) { int s=0; for(Etudiant e :
		 * f.getEtudiants()) { if(f.equals(obj)) {
		 * 
		 * } } remun += p.getPourcentage() * }
		 */
		return null;
	}

}
