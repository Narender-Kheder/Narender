package pgms;
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {

	static Scanner input= new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ran=generateRandom(1,100);
		playGame(ran);
	}

	public static int generateRandom(int low, int high) {
		int range = high-low;
		int rando= (int) (Math.random()*range+low);
		return rando;
	}
	
	public static void playGame(int actualNumber) {
		System.out.println("Welcome to the number guesser");
		System.out.println("You will have ten chances ot guess a number from");
		System.out.println("1 to 100. I will tell you if you are high or low after every guess");
		
		int tries=10;
		int nextGuess;
		do { 
			System.out.println("You have "+ tries+ " tries left");
			System.out.println("What is you r next guess");
			nextGuess= input.nextInt();
			if (nextGuess < actualNumber) {
				System.out.println("TOO HIGH!");
			}
			else if(nextGuess> actualNumber) {
				System.out.println("TOO LOW!");
			}
		
			else if (nextGuess== actualNumber) {
				System.out.println("YOU GOT IT RIGHT!!");
			}
			else { System.out.println("");
			}
		}while ( (tries>0 )&& (nextGuess!=actualNumber));tries--;
		
		if ((tries == 0) && (nextGuess != actualNumber)) {
			System.out.println("Better luck next time");
		}
		else if (nextGuess==actualNumber) {
			System.out.println("Great wrok!!! You guessed it in "+ (10-tries) +"guesses!!1");
		}
		else {System.out.println("ERROR2");}
		
		
	}
}
