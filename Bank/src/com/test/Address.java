package com.test;

public class Address 
{
	private String d_No;
	private String village;
	private String mandal;
	private String district;
	private String state;
	private int pincode;
	public String getD_No() {
		return d_No;
	}
	public void setD_No(String d_No) {
		this.d_No = d_No;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [d_No=" + d_No + ", village=" + village + ", mandal=" + mandal + ", district=" + district
				+ ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	

}
