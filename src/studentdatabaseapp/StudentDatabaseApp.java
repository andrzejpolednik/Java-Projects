package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		/*Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.showInfo());n */
		
		
		
		// Ask how many users we want to add
		System.out.println("Enter the number of new users to enroll : ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		

		
		// Create n number of new students
		for (int n=0; n< numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
		
		
	}

}
