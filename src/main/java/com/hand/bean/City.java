package com.hand.bean;

import java.sql.Timestamp;

public class City {
	private short id;
	private String city;
	private short countryid;
	private Timestamp lastupdate;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public short getCountryid() {
		return countryid;
	}
	public void setCountryid(short countryid) {
		this.countryid = countryid;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	public City() {
	}
	
}
