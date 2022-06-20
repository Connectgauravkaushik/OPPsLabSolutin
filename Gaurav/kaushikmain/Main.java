package com.Gaurav.kaushikmain;
import java.util.Scanner;
import com.Gaurav.kaushik.Employee;
import com.Gaurav.kaushik.service.Service;
public class Main {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Employee emp = new Employee("Gaurav", "Kaushik");
			    Service cs = new Service();
			    String Department;
		        String generatedEmail;
		        String showCredentials;
		        char[] genratedPasssword;
		        
		        System.out.println("PLease enter the department from the following");
				System.out.println("1. Technical");
				System.out.println("2. Admin");
				System.out.println("3. Human Resource");
				System.out.println("4. Legal");
		        
				Scanner sc = new Scanner(System.in);
				int option = sc.nextInt();
				
				switch(option) {
				case 1: emp.Technical();
				   generatedEmail = cs.generatedEmail(emp.getFirstName(), emp.getLastName(), "Tech");
				   genratedPasssword = cs.genratedPasssword();
				   cs.showCredentials(emp, generatedEmail, genratedPasssword);
				   break;
				     
				case 2: emp.Admin();
				 generatedEmail = cs.generatedEmail(emp.getFirstName(), emp.getLastName(), "Admin");
				   genratedPasssword = cs.genratedPasssword();
				   cs.showCredentials(emp, generatedEmail, genratedPasssword);
				        break;
				        
				case 3: emp.HumanResource();
				generatedEmail = cs.generatedEmail(emp.getFirstName(), emp.getLastName(), "HumanResource");
				   genratedPasssword = cs.genratedPasssword();
				   cs.showCredentials(emp, generatedEmail, genratedPasssword);
				        break;
				        
				case 4: emp.Legal();
				generatedEmail = cs.generatedEmail(emp.getFirstName(), emp.getLastName(), "Legal");
				   genratedPasssword = cs.genratedPasssword();
				   cs.showCredentials(emp, generatedEmail, genratedPasssword);
				        break;
				}
				
				if(option>4) {
				  System.out.println("Invalid option");
				  
				}

			}


	}


