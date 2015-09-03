package com.platonic.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProfileBean {
	private int id;
	private String givenName;
	private String familyName;
	private String popularity;
	
	public ProfileBean() {}
	
	public ProfileBean (int id, String givenName, String familyName, String popularity)
	{
		this.id = id;
		this.givenName = givenName;
		this.familyName = familyName;
		this.popularity = popularity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getPopularity() {
		return popularity;
	}

	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	
	
}
