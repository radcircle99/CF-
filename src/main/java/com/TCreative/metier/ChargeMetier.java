package com.TCreative.metier;

import java.util.List;
import java.util.Optional;

import com.TCreative.entities.Charge;

public interface ChargeMetier {

	public Charge saveCharge(Charge c);

	public List<Charge> listCharge();

	public Optional<Charge> findCharge(int idCharge);

	public void deleteCharge(int idCharge);

	public Charge updateCharge(Charge newCharge);


}
