package com.TCreative.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCreative.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
