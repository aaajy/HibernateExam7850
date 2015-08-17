package com.hand.bean;

import java.sql.Timestamp;

public class Customer {
	private short id;
	private byte storeid;
	private String firstname;
	private String lastname;
	private String email;
	private short addressid;
	private byte active;
	private Timestamp createdate;
	private Timestamp lastupdate;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public byte getStoreid() {
		return storeid;
	}
	public void setStoreid(byte storeid) {
		this.storeid = storeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public short getAddressid() {
		return addressid;
	}
	public void setAddressid(short addressid) {
		this.addressid = addressid;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Customer() {
	}
	public Customer(byte storeid, String firstname, String lastname,
			String email, short addressid, Timestamp createdate) {
		super();
		this.storeid = storeid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.addressid = addressid;
		this.createdate = createdate;
	}
	
}
