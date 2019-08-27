package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TCreative.dao.EtudiantRepository;
import com.TCreative.entities.Etudiant;

@Service
public class EtudiantMetierImpl implements EtudiantMetier {

	@Autowired
	private EtudiantRepository etudiantRepository;
	


	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
//		e.setDateInscription(new String());
		return etudiantRepository.save(e);
	}

	@Override
	public List<Etudiant> listEtudiant() {
		// TODO Auto-generated method stub
		
		return etudiantRepository.findAll();
	}

	@Override
	public Optional<Etudiant> findEtudiant(int idPer) {
		// TODO Auto-generated method stub
		return etudiantRepository.findById(idPer);
	}

	@Override
	public void deleteEtudiant(int idPer) {
		// TODO Auto-generated method stub
		etudiantRepository.deleteById(idPer);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant newEtudiant) {
		// TODO Auto-generated method stub
//		return etudiantRepository.findById(idPer).map(e -> {
//			if (newEtudiant.getNomPer() != null)
//				e.setNomPer(newEtudiant.getNomPer());
//			if (newEtudiant.getPrenomPer() != null)
//				e.setPrenomPer(newEtudiant.getPrenomPer());
//			if (newEtudiant.getAdressePer() != null)
//				e.setAdressePer(newEtudiant.getAdressePer());
//			if (newEtudiant.getTelPer() != 0)
//				e.setTelPer(newEtudiant.getTelPer());
//			if (newEtudiant.getDateNaissance() != null)
//				e.setDateNaissance(newEtudiant.getDateNaissance());
//			if (newEtudiant.getPhotoEtud() != null)
//				e.setPhotoEtud(newEtudiant.getPhotoEtud());
//			if (newEtudiant.getDernierMoisPayer() != null)
//				e.setDernierMoisPayer(newEtudiant.getDernierMoisPayer());
//			if (newEtudiant.getMontantPayer() != 0)
//				e.setMontantPayer(newEtudiant.getMontantPayer());
//			return etudiantRepository.save(e);
//		}).orElseGet(() -> {
 //        	newEtudiant.setIdPer(idPer);
			return etudiantRepository.save(newEtudiant);
//		});
	}

//	@Override
//	public Etudiant UpdateEtudiant(Etudiant e) {
//		// TODO Auto-generated method stub
//		 etudiantRepository.deleteById(e.getIdPer());
//		 e.setIdPer(e.getIdPer());
//		 return etudiantRepository.save(e);
//	}


	}




