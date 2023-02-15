package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_info")
public class DEMO {
	@Id
	private int id;
	private String name;
	private String dep;
	private int ph;
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
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	public DEMO(int id, String name, String dep, int ph) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.ph = ph;
	}

}
