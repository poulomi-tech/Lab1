package com.gl.service;

import java.util.Random;

public class CredentialService {

	public String generateEmailAddress( String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	public String generatePassword() {
		String numbers = "1234567890";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacter = "!@#$%^&*";
		String values = numbers+smallLetter+specialCharacter+capitalLetter;
		Random random = new Random();
		char[] password = new char[8];
		for(int i = 0; i<8; i++) {
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password.toString();
	}
	
	public void showCredentials(String email, String password) {
		System.out.println("Your generated credentials are ");
		System.out.println("Email --> " + email);
		System.out.println("Password --> "+ password);
	}
	
	
}
