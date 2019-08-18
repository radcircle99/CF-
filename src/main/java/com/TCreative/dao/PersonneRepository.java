package com.TCreative.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TCreative.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Integer>{

}
