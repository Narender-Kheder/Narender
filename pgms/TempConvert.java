package pgms;

import java.util.Scanner;

public class TempConvert {
	static Scanner input= new Scanner (System.in);
	static double user;
	static double user2;
	public static void main(String[] args) {
		
		getTemp();
		System.out.println("What do you want to convert to?");
		System.out.println("Type Celsius or Fahrenheit ");
		String choice=input.next();
		
		if (choice.equalsIgnoreCase("Fahrenheit")) {toCelsius(user); 
		System.out.println(user+" Celsius is equal to "+user2+" Fahrenheit");
		}
		
		
		else if (choice.equalsIgnoreCase("Celsius")) {toFahrenheit(user);
		System.out.println(user+" Fahrenheit is equal to "+user2+" Celsius");}
		
		else {System.out.println("Enter a real entry");}
	}

	public static double getTemp() {
		System.out.println("Hey!!!!!");
		System.out.println("Enter the tempreture you want to convert?");
		 user= input.nextDouble();
		return user;
	}
	
	public static double toCelsius(double user) {
		 user2 = (user*1.8)+32;
		return user2;
	}
	public static double toFahrenheit(double user) {
		 user2 = (user-32)/1.8;
		return user2;
	}
	
	
	
	
	
	
	
	
	
	
	
}
