package com.gl.main;

import java.util.Scanner;


import com.gl.model.Employee;
import com.gl.service.CredentialService;
import com.gl.utils.Constrants;

public class Driver {
	
	
	public static Employee emp1 = new Employee("Harry", "Potter");
	public static CredentialService cr1 = new CredentialService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		displayMenu();
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Select option --> ");
	        int a = sc.nextInt();
	    String emailAddress = ""; 
	    String password = "";
	    String Department = "";
		switch (a) {
		case 1 : Department = Constrants.Technical_Department;
			break;
		case 2 : Department = Constrants.Admin_Department;
			break;
		case 3 : Department = Constrants.HumanResource_Department;	
			break;
			
		case 4 : Department = Constrants.Legal_Department;
			break;
		default : System.out.println("Invalid choice");
		}
		if(!Department.isEmpty()) {
			emailAddress = cr1.generateEmailAddress(emp1.getfirstName(),emp1.getlastName(),"tech");
			password = cr1.generatePassword();
			cr1.showCredentials(emailAddress, password);
		}
			
	}
	
	private static void displayMenu() {
		System.out.println("Welcome to our company");
        System.out.println("Choose your Department : ");
        System.out.println("1. Technical ");
        System.out.println("2. Admin ");
        System.out.println("3. Human Resource ");
        System.out.println("4. Legal ");
        		
	}

}
