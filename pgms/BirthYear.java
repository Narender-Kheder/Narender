package pgms;

import java.util.Scanner;

public class BirthYear {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
			
		System.out.println("What is your first name?");
		String name1= input.next();
		
		System.out.println("What is your last name?");	
		
		String name2= input.next();
		System.out.println("what is your age in years?");
		int age= input.nextInt();
		int year= 2018;
		int birthyear= (year-age);
			
			
			System.out.println("Hi"+" "+ name1 + " " + name2 + ", " + "you were born in" + " " + birthyear+ "!");
				

	}

}
