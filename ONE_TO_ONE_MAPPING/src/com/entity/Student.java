package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	
	@OneToOne
	private Laptop laptop;

	public Student(int id, String name, Laptop laptop) {
		super();
		this.id = id;
		this.name = name;
		this.laptop = laptop;
	} 
	
	public Student() {
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
	
	
	
	
	
	
}
