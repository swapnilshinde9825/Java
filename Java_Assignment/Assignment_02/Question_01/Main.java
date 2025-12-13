package com.swappy.java;
import java.util.*;

public class Main {
	
	public static int menu(Scanner sc) {
		
		System.out.println();
		System.out.println();
		System.out.println("Enter 1 to add Student");
		System.out.println("Enter 2 to display all the students ");
		System.out.println("Enter 3 search student by roll no");
		System.out.println("Enter 4 to sort the students on rollno");
		System.out.println("Enter 5 to sort the students on name");
		System.out.println("Enter 6 to sort the students on marks");
		System.out.print("Enter your choise : ");
		
		
		return sc.nextInt();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list =new ArrayList<Student>();
		int choise;
		 
		class SortByName implements Comparator<Student>{

			@Override
			public int compare(Student x, Student y) {
				int diff = x.getName().compareTo(y.getName()); 
				return diff; 
			}
			
		}
		
		class SortByMarks implements Comparator<Student>{

			@Override
			public int compare(Student x, Student y) {
				int diff = (int) (x.getMarks()-y.getMarks()); 
				return diff; 
			}
			
		}
		
		while((choise = menu(sc)) != 0) {
		switch (choise) {
		case 1: {
			Student st = new Student();
			st.AcceptStudent(sc);
			list.add(st);
			System.out.println("Student entered successfully :)");
		}
		break;
		
		case 2 : {
			
			for(Student st : list) {
				System.out.println( st.toString());
			}
		}
		break;
		
		case 3:{
			System.out.print("enter the roll no :");
			int roll=sc.nextInt();
				Student st =new Student();
				st.setRollno(roll);
			int idx = list.indexOf(st); 
			if(idx!=-1) {
				Student b = list.get(idx); 
				System.out.println(b);
			}
			else {
				System.out.println("Student not found :(");
			
		} }
		break;
		
		case 4 : {
			Collections.sort(list);
			
			for(Student st : list)
			System.out.println(st);
			
		}
		
		break;
		
		case 5 : {
			Collections.sort(list, new SortByName());
			for(Student st : list)
				System.out.println(st);
		}
		break;
		
		case 6 : {
			Collections.sort(list, new SortByMarks());
			for(Student st : list)
				System.out.println(st);
			
		}
		
		}

	}

		System.out.println("Thank You :)");
}}
