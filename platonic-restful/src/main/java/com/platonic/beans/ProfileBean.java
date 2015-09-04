package com.platonic.beans;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProfileBean {
	private int id;
	private String name;
	private ArrayList<String> interests;
	private ArrayList<String> affiliation;
	
	public ProfileBean() {}
	

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

	public ArrayList<String> getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}

	public ArrayList<String> getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(ArrayList<String> affiliation) {
		this.affiliation = affiliation;
	}


	
	
}
