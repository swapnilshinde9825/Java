package question.second;

import java.util.Scanner;

public class Main {

	public static void calStringLength(String str)  throws ExceptionLineTooLong {

		if(str.length()>7) {
			throw new ExceptionLineTooLong();
			}
		else {
			System.out.println("The length of string is "+str.length());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		try {
			calStringLength(str);
		}
		catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
		
	}

}
