package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Payement;

public interface PayementMetier {

	public Payement savePayement(Payement p);

	public List<Payement> listPayement();

	public Optional<Payement> findPayement(int idPayement);

	public void deletePayement(int idPayement);

	public Payement updatePayement(Payement p);



}
