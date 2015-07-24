package br.com.paulorezende.inventorycontrol.model;

import org.springframework.data.annotation.Id;

public class Outgoing {
	
	@Id
	private String id;
	private Integer quantity;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}