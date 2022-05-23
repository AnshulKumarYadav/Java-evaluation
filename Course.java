package com.eval1;

import java.util.Scanner;

public class Course {
	 int courseId;
	 String courseName;
	 int courseFee;
	 
	 void displayCourseDetails(int a,String s,int f)
	 {
		 System.out.println("Course Id is:" +a);
		 System.out.println("CouseName is:"+s);
		 System.out.println("CouseFee is:"+f);
	 }
	 static void authenticate(String username, String Password)
	 {
		 if(username =="Admin" && Password == "1234")
		 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter courseId:");
		 Course e = new Course();
		 int a = e.courseId = sc.nextInt();
		 System.out.println("Enter courseName:");
		String s = e.courseName = sc.next();
		 System.out.println("Enter courseFee:");
		 int f =e.courseFee = sc.nextInt();
		 sc.close();
		 e.displayCourseDetails(a,s,f);
		 }
		 else {
			 System.out.println("Invalid Username or Password");
		 }
		 
	 }
	 
	 public static void main(String[] args) {
		 authenticate("Admin", "1234");
		 authenticate("admin","1234");
	}
}
