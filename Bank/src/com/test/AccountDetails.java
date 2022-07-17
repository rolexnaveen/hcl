package com.test;

public class AccountDetails 
{
	private long accountNumber;
	private String IFSC;
	private String accountType;
	private int pin;
	private double amount;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	private CustomerDetails cts;
	public CustomerDetails getCts() {
		return cts;
	}
	public void setCts(CustomerDetails cts) {
		this.cts = cts;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", IFSC=" + IFSC + ", accountType=" + accountType
				+ ", pin=" + pin + ", cts=" + cts + "]";
	}

}
