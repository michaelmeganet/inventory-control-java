package br.com.paulorezende.inventorycontrol.repository;

import br.com.paulorezende.inventorycontrol.model.Incoming;


public interface OutgoingRepository {

	public Incoming findById(String id);
	
}