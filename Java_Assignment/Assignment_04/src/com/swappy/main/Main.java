package com.swappy.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	private static final String URL = "jdbc:mysql://localhost:3306/classwork";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "manager";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	}

	public static void showStudent() {
		String sql = "select name,email,course from students";
		try {
			Connection con = getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String course = rs.getString(3);

				System.out.println(name + " ," + email + " ," + course);

			}
			con.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void updateStudent(Scanner sc) {
		String sql = "update students set course='JAVA' where name='Ramesh'";
		try {
			 Connection con= getConnection();
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.executeUpdate();
		} catch (SQLException e) {
			
		}
	}

	public static void deleteStudent() {
		String sql = "delete from students where name='Suresh'";

		try {
			Connection con= getConnection();
			 PreparedStatement stmt = con.prepareStatement(sql);
			 stmt.executeUpdate();
			 
		} catch (SQLException e) {
		
		}
	}

	public static void insertStudent(Scanner sc) {
		System.out.println("Enter the Student Name :");
		String name = sc.next();

		System.out.println("Enter the Student E-mail :");
		String email = sc.next();

		System.out.println("Enter the Student Course :");
		String course = sc.next();

		String sql = "insert into students (name,email,course) values (?,?,?)";
		try {

			PreparedStatement stmt = getConnection().prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setString(3, course);

			stmt.executeUpdate();
			System.out.println("Student Entered Successfully :)");
			stmt.close();
		}

		catch (SQLException e) {

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		showStudent();
		
		System.out.println();
		System.out.println();
		
		insertStudent(sc);
		
		System.out.println();
		System.out.println();
		showStudent();
		
		updateStudent(sc);
		
		System.out.println();
		System.out.println();
		showStudent();
		
		deleteStudent();
		
		System.out.println();
		System.out.println();
		showStudent();
		
	}

}
