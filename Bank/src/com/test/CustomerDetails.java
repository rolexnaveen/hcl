package com.test;

public class CustomerDetails 
{
	private long phone_num;
	private String name;
	private String fatherName;
	private long aadharNumber;
	private  String panNumber;
	
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "CustomerDetails [phone_num=" + phone_num + ", name=" + name + ", fatherName=" + fatherName
				+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + ", address=" + address + "]";
	}
	
	
	
	
}
