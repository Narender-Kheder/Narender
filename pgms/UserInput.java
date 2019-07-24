package pgms;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter a number");
		int num1 = input.nextInt();
		System.out.println("your number is " + num1);
		
		System.out.println("enter a decimal number");
		double num2= input.nextDouble();
		System.out.println("your new number is "+ num2);
		
		System.out.println("what your fav food?");
		String fav1 = input.next();
		System.out.println("your fav food is "+ fav1);
		
		System.out.println("what your mark in com sci?");
		int mark= input.nextInt();
		if (mark != 100)
		{
			System.out.println("Dumb ass bitch!!!!!");
		}
		
		else  
			System.out.println("Ayeeee, smart guy!");
	}
		
	

}
