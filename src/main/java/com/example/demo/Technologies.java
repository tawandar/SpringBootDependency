package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int tehcid;
	private String techname;
	public int getTehcid() {
		return tehcid;
	}
	public void setTehcid(int tehcid) {
		this.tehcid = tehcid;
	}
	public String getTechname() {
		return techname;
	}
	public void setTechname(String techname) {
		this.techname = techname;
	}
	
	public void tech() {
		
		System.out.println("Technology successful");
		
		
	}

}
