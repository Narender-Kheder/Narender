package pgms;
import java.util.Random;
import java.util.Scanner;
public class MathDrills {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Random rand = new Random();
	
		
	// Choosing between multiplication and addition
		System.out.println("Hello! Welcome to Math Drill!");
		System.out.println("Would you like to do Addition or Multiplication?");
		String choice= input.next();
		
	//Choosing max and min for the numbers
		System.out.println("What is your minimum value");
		int min= input.nextInt();
		System.out.println("What is your maximum value");
		int max1= input.nextInt();
		int max= (max1-min)+1;
		if (max1<=min) { System.out.println("Error, fix your minimum and/or maximum values");}
		else 
		
	// Entering number of questions and variables that will be needed later on
		System.out.println("How many questions would you like to have?");
		int questions= input.nextInt();
		int counter=0;
		int incorrect=0;
		
	// Timer starts
		long beginTime = System.currentTimeMillis();
		
	// If addition is chosen 
		if (choice.equalsIgnoreCase("Addition") ) { 
			while (counter < questions) {
			       int random1 = rand.nextInt(max) + min; 
			       int random2= rand.nextInt(max) + min; 
			       System.out.println(random1 + "+" + random2+"= ?");
			       int ans1 = 0;
			       
			       do {
			    	   ans1 = input.nextInt();
			    	   if (ans1 == random1 + random2) { System.out.println("Correct!");}
			    	   else { incorrect++; System.out.println("Incorrect, try again! ");}
			          }	while (ans1 != random1 + random2); counter++;
			     }
			System.out.println("Wow Great Job!");
			System.out.println("You finished "+ counter+ " questions!!");
			if (incorrect > 0) {System.out.println("But you got "+incorrect+ " incorrect");}
			else {System.out.println("And you got none wrong!!");}
		}
		
		
		
		
		
	
	// If multiplication is chosen
		else if (choice.equalsIgnoreCase("Multiplication")) {
			while (counter < questions) {
			       int random1 = rand.nextInt(max) + min; 
			       int random2= rand.nextInt(max) + min; 
			       System.out.println(random1 + "x" + random2+"= ?");
			       int ans1 = 0;
			       
			       do {
			    	   ans1 = input.nextInt();
			    	   if (ans1 == random1*random2) { System.out.println("Correct!");}
			    	   else  {incorrect++; System.out.println("Incorrect, try again! ");}
			          }	while (ans1 != random1*random2); counter++;
			     }
			System.out.println("Wow Great Job!");
			System.out.println("You finished "+ counter+ " questions!!");
			if (incorrect > 0) {System.out.println("But you got "+incorrect+ " incorrect");}
			else {System.out.println("And you got none wrong!!");}
		}
		
	// Else or error statement
		else {System.out.println("Error");}
		
	// Timer ends and the time is displayed in minutes and seconds
		long endTime = System.currentTimeMillis();
	  	long difference = endTime - beginTime;
	  	double minutes2= difference%60000;
		int minutes= (int) (difference/60000);
	    double seconds2= minutes2%1000;
		int seconds=(int) (minutes2/1000);
		String s1 = "";
		if (minutes >= 1) {s1 = " "+ minutes+ " minutes, "; }
		if (seconds >= 0) {s1 = s1 + seconds+ " seconds";}
		else {System.out.println("Error");}
		System.out.println("It took you "+s1+ " to complete this activity!");
		
		
		
		
		
		
		
		
	}

}
