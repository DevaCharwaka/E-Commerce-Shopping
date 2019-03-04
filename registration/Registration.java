package com.registration;
import java.io.Serializable;


public class Registration implements Serializable{
	String name,address,password;
	
private	long phNo;
//private int bal;

	
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

/*	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}*/


}
