package com.swappy.java;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	float marks;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, float marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void AcceptStudent(Scanner sc) {
		System.out.println("Enter roll no of student :");
		this.rollno = sc.nextInt();
		System.out.println("Enter Name of student :");
		this.name = sc.next();
		System.out.println("Enter marks of student :");
		this.marks = sc.nextFloat();

	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (obj instanceof Student) {
			Student st = (Student) obj;
			if (rollno != st.rollno)
				return false;

		}
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollno - o.rollno;

	}
}
