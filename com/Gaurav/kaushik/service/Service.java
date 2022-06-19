package com.Gaurav.kaushik.service;
import com.Gaurav.kaushik.Employee;
import com.Gaurav.kaushikmain.*;

import java.util.Random;
import java.util.random.*;
public class Service{


public char[] genratedPasssword() {
	String capitalLetters ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String smallLetters= "abcdefghijklmnopqrstuvwxyz";
	String numbers= "01234567789";
	String specialcharacters= "!@#$%^&*()+=-/<>";
	
	String values = capitalLetters + smallLetters +numbers +specialcharacters;
	
	Random random = new Random();
	char[] password = new char[8];
	
	for(int i=0; i<8; i++) {
		password[i]= values.charAt(random.nextInt(values.length()));
	}
	return password;
			
	
}
	public String generatedEmail (String firstName,String lastName, String Department) {
		return firstName+lastName +"@"+Department +".abc.com";	
	}
	
	
	public void showCredentials(Employee emp, String email, char[] password ) {
		System.out.println("Dear " +emp.getFirstName()+ " your generated credentials are as follows:");
	    System.out.println("Email-->" +email);
	    System.out.println("password -->" +genratedPasssword());
		
	}



}
