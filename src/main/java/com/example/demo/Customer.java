package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int id;
	private String name;
	private String address;
	
	@Autowired //inject Technologies object "It allows Spring to resolve and inject collaborating beans into our bean."
	private Technologies techdetail;
	
	
	public Technologies getTechdetail() {
		return techdetail;
	}
	public void setTechdetail(Technologies techdetail) {
		this.techdetail = techdetail;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void hello() {
		System.out.println("customer object returned successfully");
		techdetail.tech();
	}
	
	

}
