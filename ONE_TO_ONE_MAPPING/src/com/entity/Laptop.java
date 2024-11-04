package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	private int l_id;
	private String l_model;
	
	public Laptop(int l_id, String l_model) {
		super();
		this.l_id = l_id;
		this.l_model = l_model;
	}
	
	public Laptop() {
		
		
	}

	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

	public String getL_model() {
		return l_model;
	}

	public void setL_model(String l_model) {
		this.l_model = l_model;
	}

	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", l_model=" + l_model + "]";
	}
	
	
	

}
