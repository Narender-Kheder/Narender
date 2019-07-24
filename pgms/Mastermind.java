package pgms;
import java.util.Scanner;
public class Mastermind {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in );
	//Intro
		System.out.println("Welcome to Mastermind");
		System.out.println("The CPU will create a random sequence of pegs");
		System.out.println("The three pegs are blue, red, and green");
		System.out.println("You have 10 trys to guess the pegs");
		System.out.println("Enter your guess in a format such as this: RBG or GBR");
		
	//Create the numbers	
		int num1= (int) (Math.random()*3+1);
		String char1 = null;
		int num2= (int) (Math.random()*3+1);
		String char2 = null;
		int num3= (int) (Math.random()*3+1);
		String char3 = null;
		
	
	//Make the random numbers, into pegs	
		switch (num1) {
		case 1: char1= "R"; break;
		case 2: char1= "G"; break;
		case 3: char1= "B"; break;
		default: break;
		}
		
		switch (num2) {
		case 1: char2= "R"; break;
		case 2: char2= "G"; break;
		case 3: char2= "B"; break;
		default: break;
		}
		
		switch (num3) {
		case 1: char3= "R"; break;
		case 2: char3= "G"; break;
		case 3: char3= "B"; break;
		default: break;
		}
	
	
		String guess1;
		String guess2;
		String guess3;
		
	//User enters guesses
		for (int counter = 1; counter <= 10; counter++) {
			System.out.println("Enter your guess for letter one");
			guess1 = input.next();
			System.out.println("Enter your guess for letter two");
			guess2 = input.next();
			System.out.println("Enter your guess for for letter three");
			guess3 = input.next();

			
			if (guess1.equalsIgnoreCase(char1) && guess2.equalsIgnoreCase(char2)
					&& guess3.equalsIgnoreCase(char3)) {
				System.out.println("You got perfect! You took " + counter + " tries");
				System.exit(0);
				break;	}

			else if (guess1.equalsIgnoreCase(char1) && guess2.equalsIgnoreCase(char2)) {
				System.out.println("You got two of three pegs");}
			else if (guess1.equalsIgnoreCase(char1) && guess3.equalsIgnoreCase(char3)) {
				System.out.println("You got two of three pegs");}

			 else if (guess3.equalsIgnoreCase(char3) && guess2.equalsIgnoreCase(char2)) {
				System.out.println("You got two of three pegs");}

			 else if (guess1.equalsIgnoreCase(char1)) {
				System.out.println("You got one of three pegs");}

			 else if (guess2.equalsIgnoreCase(char2)) {
				System.out.println("You got one of three pegs");}

			 else if (guess3.equalsIgnoreCase(char3)) {
				System.out.println("You got one of three pegs");}

			 else {System.out.println("You got all wrong");}
			System.out.println("Try again");
		}
			
		System.out.println("Thanks for playing!!!");
		
		
		
		
		
		
		
	}

}
