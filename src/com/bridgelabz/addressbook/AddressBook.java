package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	// instance objects
	
	Scanner sc = new Scanner(System.in); 
	ArrayList<Contact> contactArrayList = new ArrayList<>();
	
	public void addContact() {
		
		Contact contact = new Contact();
		System.out.println("Enter the First Name : ");
		contact.setFirstName(sc.next());
		System.out.println("Enter the Last Name : ");
		contact.setLastName(sc.next());
		System.out.println("Enter the Address : ");
		contact.setAddress(sc.next());
		System.out.println("Enter the City : ");
		contact.setCity(sc.next());
		System.out.println("Enter the State : ");
		contact.setState(sc.next());
		System.out.println("Enter the Zipcode : ");
		contact.setZipCode(sc.next());
		System.out.println("Enter the Mobile Number : ");
		contact.setPhoneNum(sc.next());
		System.out.println("Enter the Email Id : ");
		contact.setEmailId(sc.next());
		contactArrayList.add(contact);
	}
	
	public void displayContact() {
		for(int i = 0; i < contactArrayList.size(); i++) {
			Contact contact = contactArrayList.get(i);
			System.out.println(contact.toString());
		}
	}
	
	public void editContact() {
		
		System.out.println("Enter the First Name of Contact to Edit : ");
		String firstName = (sc.next());
		boolean isAvailable = false;
		
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equals(firstName)) {
				isAvailable = true;
				System.out.println("Enter the First Name : ");
				contact.setFirstName(sc.next());
				System.out.println("Enter the Last Name : ");
				contact.setLastName(sc.next());
				System.out.println("Enter the Address : ");
				contact.setAddress(sc.next());
				System.out.println("Enter the City : ");
				contact.setCity(sc.next());
				System.out.println("Enter the State : ");
				contact.setState(sc.next());
				System.out.println("Enter the Zipcode : ");
				contact.setZipCode(sc.next());
				System.out.println("Enter the Mobile Number : ");
				contact.setPhoneNum(sc.next());
				System.out.println("Enter the Email Id : ");
				contact.setEmailId(sc.next());
			}
		}
		if(isAvailable == false) {
			System.out.println("Contact Not Available.");
		}
	}
	
	public void deleteContact() {
		System.out.println("Enter the First Name to Delete the Contact : ");
		String firstName = (sc.next());
		boolean isAvailable = false;
		
		for(Contact contact : contactArrayList) {
			if(contact.getFirstName().equalsIgnoreCase(firstName)) {
				isAvailable = true;
				contactArrayList.remove(contact);
				System.out.println("Contact is Deleted ");
				break;
			}
		}
		if(isAvailable == false) {
			System.out.println("Contact Not Available.");
			
		}	
	}
}
