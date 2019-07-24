package pgms;
import java.util.Scanner;
public class PrimeDetector {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);

	// Introduction for the user
		System.out.println("Hello! Welcome to the prime number dectector!");
		
	// asking the user what they want to do
		System.out.println("Choose from one of the following options:");
		System.out.println("Option 1: Detect wether or not the value is prime");
		System.out.println("Option 2: List all the prime numbers leading to you entered value");
		System.out.println("Option 3: Do both Option 1 and Option 2");
		System.out.println("Enter the option number");
		int opt= input.nextInt();
		
		
	//if option 1 is chosen	
	if (opt==1)	{
		System.out.println("What is the value that you would like to have detected?");
		int num=input.nextInt();
		int f=0;
		
		// testing whether or not the value entered is a prime number
		for (int i=2; i<=num-1; i++ ) {
			int rem= num%i;
			if (rem==0) { f++;}
			else {}
			}
		
		// Output statement for results
		if (f>= 1) {System.out.println(num+ "  is not a prime number");}
		else {System.out.println(num+ " is a prime number!");}
	}
			 
	
	else if (opt==2) {
		System.out.println("What is the value that you would like to have detected?");
		int num=input.nextInt();

		//All the prime number leading to the users entry
		System.out.println();
		System.out.println("These are all the prime numbers leading up to the value you had entered:");
		for (int j=2; j< num; j++) {
			int d=0;
			for (int s=2; s<j; s++ ) {
				int rem1= j%s;
				if (rem1==0) {d++; }
				else {}
				}
			if (d> 0) {}
			else {System.out.println(j);}
			}
	}
		
	else if (opt==3) {
		System.out.println("What is the value that you would like to have detected?");
		int num=input.nextInt();
		int f=0;
		
		// testing whether or not the value entered is a prime number
		for (int i=2; i<=num-1; i++ ) {
			int rem= num%i;
			if (rem==0) { f++;}
			else {}
			}
		
		// Output statement for results
		if (f>= 1) {System.out.println(num+ "  is not a prime number");}
		else {System.out.println(num+ " is a prime number!");}
		
		//All the prime number leading to the users entry
		System.out.println();
		System.out.println("These are all the prime numbers leading up to the value you had entered:");
		for (int j=2; j< num; j++) {
			int d=0;
			for (int s=2; s<j; s++ ) {
				int rem1= j%s;
				if (rem1==0) {d++; }
				else {}
				}
			if (d> 0) {}
			else {System.out.println(j);}
			}
	}
	
	else {System.out.println("Error");}
			
		
		
		
		
		
		
	
	
	
	
	}
		
			
}

	
	
	
	
	
	
	
	
	
	