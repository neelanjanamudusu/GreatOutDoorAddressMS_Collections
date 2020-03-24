package com.cg.go.controller;

import java.util.Scanner;

import com.cg.go.service.AddressMSService;
import com.cg.go.service.AddressMSServiceInterface;

public class AddressMSController {

	static AddressMSServiceInterface service=new AddressMSService();
	
	@SuppressWarnings("resource")
	public static void main(String [] args)
	{
		while(true)
		{
			System.out.println("Address Management system Of Great Outdoor \n 1-->Add Address \n 2-->Update Address \n 3-->Delete Address \n 4-->Exit");
			System.out.println("Choose ur Option");
			Scanner sc=new Scanner(System.in);
			int option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				System.out.println("*****************Add Address*************");
				System.out.println("enter id : ");
				int userid=sc.nextInt();
				
				System.out.println("enter house number(Avoidspace): ");
				String housenumber=sc.next();
				
				System.out.println("enter street number (Avoidspace): ");
				String streetnumber=sc.next();
				
			    System.out.println("enter city: ");
			    String city=sc.next();
			    
			    System.out.println("enter district(Avoidspace):");
			    String district=sc.next();
			    
			    System.out.println("enter state(Avoidspace): ");
			    String state=sc.next();
			    
			    System.out.println("enter pincode: ");
			    long pincode=sc.nextLong();
				
			    int address=service.addAddress(userid,housenumber,streetnumber,city,district,state,pincode);
			    
			    if(address==1)
			    	System.out.println("Added Successfully");
			    else 
			    	System.out.println("Add Unsuccessful");
				break;
			case 2:
			  {
				System.out.println("Enter user id");
				int uid=sc.nextInt();
						
				System.out.println("Enter all the  address  details to update");
				
				System.out.println("Enter  HouseNo.");
				String hno=sc.next();
						
				System.out.println("Enter  StreetNo. ");
				String sno=sc.next();
						
				System.out.println("Enter  City ");
				String cityn=sc.next();
						
				System.out.println("Enter  District");
				String dist=sc.next();
						
				System.out.println("Enter  State");
				String staten=sc.next();
						
				System.out.println("Enter pincode");
				Long pinc=sc.nextLong();
						
				int addressUpdate=service.updateAddress(uid,hno,sno,cityn,dist,staten,pinc);
				if(addressUpdate == 1)
					System.out.println("Updated Sucessfully");
				else 
					System.out.println("Update Unsucessful"); 
					
				break;
			  }
			case 3:
				System.out.println("************Delete Address******************");
				System.out.println("Enter UserId to Delete Address");
				int uid=sc.nextInt();
				int result=service.deleteAddress(uid);
				if(result==1)
					System.out.println("Delete Sucessfull");
				else 
					System.out.println("Delete UnSucessfull");
				
				break;
			default:
				System.exit(option);
				break;
			}
			
		}
	}
}
