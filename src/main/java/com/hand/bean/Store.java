package com.hand.bean;

import java.sql.Timestamp;

public class Store {
	private byte id;
	private byte managerstaffid;
	private short addressid;
	private Timestamp lastupdate;
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public byte getManagerstaffid() {
		return managerstaffid;
	}
	public void setManagerstaffid(byte managerstaffid) {
		this.managerstaffid = managerstaffid;
	}
	public short getAddressid() {
		return addressid;
	}
	public void setAddressid(short addressid) {
		this.addressid = addressid;
	}
	public Timestamp getLastupdate() {
		return lastupdate;
	}
	public void setLastupdate(Timestamp lastupdate) {
		this.lastupdate = lastupdate;
	}
	public Store() {
	}
	
}
