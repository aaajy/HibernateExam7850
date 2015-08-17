package com.hand.bean;

import java.sql.Timestamp;

public class Address {
	private short id;
	private String address;
	private String address2;
	private String district;
	private short cityid;
	private String postalcode;
	private String phone;
	private Timestamp lastupdate;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public short getCityid() {
		return cityid;
	}
	public void setCityid(short cityid) {
		this.cityid = cityid;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Address() {
	}
	
}
