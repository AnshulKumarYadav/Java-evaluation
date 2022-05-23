package com.eval1;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Student()
	{
//		rollNumber = "roll";
	}
	public Student(int rollNumber,String studentName,int marks)
	{
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.studentName = studentName;
		
	}
	public int getMarks() {
		return marks;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public static void main(String[] args) {
		
	}
}

class Maine
{
	static void displayDetails(int roll,String n,int marks)
	{
		Student student = new Student();
		System.out.println("The roll number is :"+roll);
		System.out.println("The Student Name is :"+n);
		System.out.println("The Student marks is:"+marks);
	}
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
			displayDetails(roll,n,marks);
			
		}
	}
}
