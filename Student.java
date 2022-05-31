package com.eval1;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student(){};
	public Student(int rollNumber,String studentName,int marks)
	{
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.studentName = studentName;
		
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}

class Maine
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int students = s.nextInt();
		for(int i=0;i<students;i++)
		{
			System.out.println("Enter the Roll Number :");
			int roll = s.nextInt();
			System.out.println("Enter the Name:");
			String n  = s.next();
			System.out.println("Enter the marks:");
			int marks = s.nextInt();
			
			Student student = new Student(roll,n,marks);
			System.out.println("The roll no: "+student.getRollNumber());
			System.out.println("The Name of Student is: "+student.getStudentName());
			System.out.println("The Marks of "+student.getStudentName()+" is "+student.getMarks());
		}
		s.close();
	}
}
