package com.student.management;

import java.util.*;

import com.student.utils.WriteToFile;

public class StudentDatabaseApp {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Enter the number of new students to enrol: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents =in.nextInt();
		Student[] students = new Student[numOfStudents];
		for(int n=0; n< numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
			
		}
		WriteToFile.writeCountryListToFile("Students.xlsx",Arrays.asList(students));
		
		
		
		// how many students to add in the database
		
		// how many new students must be added into it.

	}

}
