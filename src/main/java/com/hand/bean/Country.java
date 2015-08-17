package com.hand.bean;

import java.sql.Timestamp;

public class Country {
	private short id;
	private String country;
	private Timestamp lastupdate;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Country() {
	}
	
}
