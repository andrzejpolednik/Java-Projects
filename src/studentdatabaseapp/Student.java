package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses ="";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	
	
	
	
	// Constructor: prompt user to enter the name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student's first Name: ");
		this.firstName = in.nextLine();
	
		System.out.println("Enter Student's first Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter Student's class level: ");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
		
	}

	// Generate an ID
	private void setStudentID() {
		//Grade Level + ID
		id++;
		this.studentID = gradeYear + "" + id;
			
	}
	
	// Enroll in courses
	
	public void enroll() {
		//Get inside a loop, user hits 0
		
		
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break;}
		} while (1!=0);
		System.out.println("Enrolled in : " + courses);
		System.out.println("Tuition balance: " + tuitionBalance);
	}
	
	
	// View Balance
	public void viewBalance() {
		System.out.println("Your Balance is : " + tuitionBalance + "$");
	}
	
	// Pay Tution
	public void payTuition() {
		System.out.print("Enter the payment ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thanks for your payment of " + payment + "$");
		viewBalance();
		
	}
	
	// Show Status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGradeLeveL : " + gradeYear +
				"\nStudent ID : " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance : " + tuitionBalance;
	}
	
	
	
	
	
	
	
	

}
