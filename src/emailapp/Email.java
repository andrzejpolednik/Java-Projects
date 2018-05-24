 package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	//Constructor to receive the first and the last name
	
	public Email() {
		this.firstName = setFirstName();
		this.lastName = setLastName();

		
		//Call the method asking for the department - return the department
		
		this.department = setDepartment();
		
		
		//Call the method that returns a random password
		
		this.password = randomPassword(defaultPasswordLength);

		
		//Combine the elements to generate the email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "company.com";

	}
	
	
	// Ask for the name
	
	private String setFirstName() {
		System.out.println("Enter yout first name : ");
		Scanner in = new Scanner(System.in);
		String firstName = in.nextLine();
		return firstName;
		
	}
		
	private String setLastName() {
		System.out.println("Enter yout last name : ");
		Scanner in = new Scanner(System.in);
		String lastName = in.nextLine();
		return lastName;
		
	}
	
	//Ask for the department. 
	
	private String setDepartment() {
		System.out.println("Choose your department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner in = new Scanner(System.in);
		int departmentChoice = in.nextInt();
		if (departmentChoice == 1) { return "Sales"; }
		else if (departmentChoice == 2) { return "Development " ; }
		else if (departmentChoice == 3) { return " Accounting " ; }
		else { return "" ;}
		
		}
		
	
	//Generate a random password
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPRQSTUVWXYZ0123456789";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
		
	}
	public int getMailboxCapacity() { return mailboxCapacity ; }
	public String getAlternateEmail() { return alternateEmail ; }
	public String getPassword() { return password ; }	
	
	//Show info 
	
	public String showInfo() {
		return "DISPLAY NAME : " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL : " + email + "\n" +
				"MAILBOX CAPACITY : " + mailboxCapacity + "mb";
				
	}
	
}

	
	
	


