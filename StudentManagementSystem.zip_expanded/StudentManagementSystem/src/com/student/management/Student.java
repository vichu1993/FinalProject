package com.student.management;

import java.util.Scanner;

public class Student {

	
	private String firstName;
		private String lastName;
		private int gradeYear;
		private String studentregistrationID;
		private String studentCourses="";
		private int tuitionBalance =0;
		private static int costofCourse=800;
		private static int id= 100;
		private boolean feePaid = false;
		
		
		// Constructor to use the name and year
	    public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the student first name : ");
		this.firstName=in.nextLine();
		
		
		System.out.print("Enter the student last name : ");
		this.lastName=in.nextLine();
		System.out.print("1 Undergraduate\n2 Masters \n3 Thesis \n4 Phd\nEnter the grade level:");
		this.gradeYear =in.nextInt();
		setstudentregistrationID();
		
		
		}
	    
	    //generate an ID
	    private void setstudentregistrationID() {
	    	
	    	//grade level + ID 
	    	id++;
	    	this.studentregistrationID = gradeYear +"" +id; 
	    	}
	    public void enroll() {
	    	//get inside loop[
	    	do {
	    	System.out.print("Enter the course to enrol(Q to quit): ");
	    	Scanner in = new Scanner(System.in);
	    	String course =in.nextLine();
	    	if(!course.equals("Q")) {
	    	studentCourses = studentCourses + "\n  " +course;
	    	tuitionBalance = tuitionBalance+ costofCourse;
	    	
	    	}
	    	else { 
	    		
	    		break; }
	    	}while(1!=0);
	    	
	    }
	    public void viewBalance() {
	    	System.out.println("Your Balance is: $" + tuitionBalance);
	    }
	    public void payTuition() {
	    	viewBalance();
	    	System.out.print("Enter your payment: $");
	    	Scanner in = new Scanner(System.in);
	    	int payment = in.nextInt();
	    	tuitionBalance = tuitionBalance - payment;
	    	System.out.println(" Thanking you for the payment of $" + payment);
	    	viewBalance();
	    	
	    }
	     public String toString() {
	    	return "Name: "+ firstName + " " + lastName + "\nClasLevel :" +gradeYear +"\nStudentID: " +studentregistrationID + "\nCoursesEnrolled:" + studentCourses + "\nBalance: $" +tuitionBalance;
	    }

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getGradeYear() {
			return gradeYear;
		}

		public void setGradeYear(int gradeYear) {
			this.gradeYear = gradeYear;
		}

		public String getStudentregistrationID() {
			return studentregistrationID;
		}

		public void setStudentregistrationID(String studentregistrationID) {
			this.studentregistrationID = studentregistrationID;
		}

		public String getStudentCourses() {
			return studentCourses;
		}

		public void setStudentCourses(String studentCourses) {
			this.studentCourses = studentCourses;
		}

		public int getTuitionBalance() {
			return tuitionBalance;
		}

		public void setTuitionBalance(int tuitionBalance) {
			this.tuitionBalance = tuitionBalance;
		}

		public static int getCostofCourse() {
			return costofCourse;
		}

		public static void setCostofCourse(int costofCourse) {
			Student.costofCourse = costofCourse;
		}

		public static int getId() {
			return id;
		}

		public static void setId(int id) {
			Student.id = id;
		}

		public boolean isFeePaid() {
			return feePaid;
		}

		public void setFeePaid(boolean feePaid) {
			this.feePaid = feePaid;
		}
		
		


	
}

 