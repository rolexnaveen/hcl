package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Banking

{
	
 public static void main(String[] args) 
	{
		ArrayList<AccountDetails>acd = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//System.out.println("enter n value");
		//int n = scanner.nextInt();
		boolean status;
		do	
		{
			
			
			
		CustomerDetails cts = new CustomerDetails();
		/*cts.setAadharNumber(9888081315884l);
		cts.setFatherName("ramana");
		cts.setName("naveen");
		cts.setPhone_num(8074325246l);
		cts.setPanNumber("bulpn7308c");*////
		
		
		System.out.println("Enter AadharNumber :");
		cts.setAadharNumber(scanner.nextLong());
		System.out.println("Enter Father's Name:");
		String FatherName = scanner.next();
		System.out.println("Enter your Name:");
		String Name = scanner.next();
		System.out.println("Enter your Phone Number:");
		long PhoneNum=scanner.nextLong();
		//sc.nextLine();
		System.out.println("Enter your pan Number:");
		String Pan = scanner.next();
		
	      
	      cts.setFatherName(FatherName);//dynamic values
	      cts.setName(Name);
	      cts.setPhone_num(PhoneNum);
	      cts.setPanNumber(Pan);
		Address address = new Address();
		
		System.out.println("enter d-no");
		String dNO =scanner.next();
		System.out.println("Enter Village");
		String village = scanner.next();
		System.out.println("mandal");
		String mandal = scanner.next();
		System.out.println("Enter district");
		String district = scanner.next();
		System.out.println("enter state");
		String state = scanner.next();
		System.out.println("enter pincode");
		int pincode = scanner.nextInt();
		
		address.setD_No(dNO);
		address.setVillage(village);
		address.setMandal(mandal);
		address.setDistrict(district); //dynamic values
		address.setState(state);
		address.setPincode(pincode);
		
		cts.setAddress(address);
		
		AccountDetails act = new AccountDetails();

	    //Scanner sc = new Scanner(System.in);
		scanner.nextLine();
	    System.out.println("enter account number");
	    long account = scanner.nextLong();
	    System.out.println("enter IFCS code");
	    String ifsc  = scanner.next();
	    System.out.println("enter accountType");
	    String accountType =scanner.next();
	    System.out.println("enter your pin");
	    int pin = scanner.nextInt();
	    
	    act.setAccountNumber(account);
	    act.setIFSC(ifsc);
	    act.setAccountType(accountType);
	    act.setPin(pin);
	    
	   // System.out.println("AccountDetails:" +act);
	    act.setCts(cts);
	    System.out.println(act);
	    
	    Service service = new Service();
	    
	    service.balanceEnquiry();
	    System.out.println("Enter your deposite: ");
	    double amount = scanner.nextDouble();
	    System.out.println("Enter your withdrawn : ");
	    double amount1 = scanner.nextDouble();
	    
	   
		acd.add(act);
		
		System.out.println("enter 1 it's continue otherwise it exit");
	   
		 status = false;
		 int n = scanner.nextInt();
		if (n==1)
		{
			System.out.println("continue");
			status=true;
		}
	    
		}
		while(status);
	    
		
		}
	
	
	}


