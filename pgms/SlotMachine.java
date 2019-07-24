package pgms;
import java.util.Scanner;
public class SlotMachine {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in );
		
// Intro for the user, it tells the user how to play and how hte scoring works
		System.out.println("Welcome To The Slot Machine!!");
		System.out.println("All players start with $100");
		System.out.println("How to play:");
		System.out.println("1. place your bet");
		System.out.println("2. Upon placing your bet, the wheels spin");
		System.out.println("");
		System.out.println("You get prize money if the wheels match");
		System.out.println("If they do not, then you loss your bet");
		System.out.println("Here is how the score mulitply");
		System.out.println("If three $, then your bet is multiplied by 100");
		System.out.println("If three &, then your bet if multiplied by 20");
		System.out.println("If three %, then your bet is mulltiplied by 15");
		System.out.println("If three @, then your bet is multiplied by 10");
		System.out.println("If there any two that match, you get half your bet back");
		System.out.println("If not, you lose your bet!");
		System.out.println("");
		
//Asking the user if they would like to play
		System.out.println("Lets play?");
		System.out.println("Yes to play");
		System.out.println("No to exit");
		String userstart= input.next();
		if (userstart.equalsIgnoreCase("yes")) {}
		else if (userstart.equalsIgnoreCase("No")) { System.out.println("Good Bye :( "); System.exit(0);}
		else {System.out.println("Incorrect Input"); System.exit(0);}		
		
		System.out.println("Lets play!!");
		System.out.println("You have $100 in your balance");
	
//Variables for the loop
		int l=0;
		int counter=0;
		int bet2=0;
		int win=0;
		int win2=0;
		int win3=0;
		int win4=0;
		int balance=100;
		int bet=0;
		int balance2=0;
		int bet3=0;
		int lose=0;
//Actually starting the game
	do {	
		
	//Asking the user for their bet		
			  do {
				System.out.println("Enter your bet");
				bet = input.nextInt();
				if ((bet <= 0) || (bet > balance)) {
					System.out.println("Your balance is not that high, Your broke!");}
			}while((bet <= 0) || (bet > balance));
			
			balance -= bet;	
			bet3 += bet;
	
			//Creating the random numbers
			int wheel1= (int) (Math.random()*4+1);
			int wheel2= (int) (Math.random()*4+1);
			int wheel3= (int) (Math.random()*4+1);
		
	//turning the random numbers into actual wheel outputs
			String sign1= null;
			String sign2=null;
			String sign3=null;
			String sign4=null;
			
			switch (wheel1) {
			case 1: sign1= "$"; break;
			case 3: sign1= "&"; break;
			case 2: sign1= "%"; break;
			case 4: sign1= "@"; break;
			default: break;
			}
			
			switch (wheel2) {
			case 1: sign2= "$"; break;
			case 3: sign2= "&"; break;
			case 2: sign2= "%"; break;
			case 4: sign2= "@"; break;
			default: break;
			}
			
			switch (wheel3) {
			case 1: sign3= "$"; break;
			case 3: sign3= "&"; break;
			case 2: sign3= "%"; break;
			case 4: sign3= "@"; break;
			default: break;
			}
			
			System.out.println(sign1);
			System.out.println(sign2);
			System.out.println(sign3);
			
			
	// Declaring weather or not the user has won anything
			
				if ((sign1 == "$") && sign1.equals(sign2) && sign1.equals(sign3)) {
					System.out.println("You won! Your bet will be multiplied by 100!");
					win=bet*100; win3++;
				} else if ((sign1 == "&") && sign1.equals(sign2) && sign1.equals(sign3)) {
					System.out.println("You won! Your bet will be multiplied by 20!");
					win=bet*20; win3++;
				} else if ((sign1 == "%") && sign1.equals(sign2) && sign1.equals(sign3)) {
					System.out.println("You won! Your bet will be multiplied by 15!");
					win=bet*15; win3++;
				} else if ((sign1 == "@") && sign1.equals(sign2) && sign1.equals(sign3)) {
					System.out.println("You won! Your bet will be multiplied by 10!");
					win=bet*10; win3++;
				
		//Half wins
				} else if ((sign1 == "$") && sign1.equals(sign2)|| sign1.equals(sign3)&& !sign2.equals(sign3)) {
						System.out.println("You got a Half Win! You get half your bet back!");
						win=bet/2; win4++;
				} else if ((sign1 == "&") && sign1.equals(sign2)|| sign1.equals(sign3)&& !sign2.equals(sign3)) {
					System.out.println("You got a Half Win! You get half your bet back!");
					win=bet/2; win4++;
				} else if ((sign1 == "%") && sign1.equals(sign2) || sign1.equals(sign3)&& !sign2.equals(sign3)) {
					System.out.println("You got a Half Win! You get half your bet back!");
					win=bet/2; win4++;
				} else if ((sign1 == "@") && sign1.equals(sign2) || sign1.equals(sign3) && !sign2.equals(sign3)) {
					System.out.println("You got a Half Win! You get half your bet back!");
					win=bet/2; win4++;
					
				} else if ((sign2 == "$") &&  sign2.equals(sign3) && !sign1.equals(sign3)) {
					System.out.println("You got a Half Win! You get half your bet back!");
					win=bet/2; win4++;
				} else if ((sign2 == "&") &&  sign2.equals(sign3) && !sign1.equals(sign3)) {
				System.out.println("You got a Half Win! You get your half bet back!");
				win=bet/2; win4++;
				} else if ((sign2 == "%") &&  sign2.equals(sign3) && !sign1.equals(sign3)) {
				System.out.println("You got a Half Win! You get your half bet back!");
				win=bet/2; win4++;
				} else if ((sign2 == "@") &&  sign2.equals(sign3) && !sign1.equals(sign3)) {
				System.out.println("You got a Half Win! You get your half bet back!");
				win=bet/2; win4++;
				} else {System.out.println("You lost. Your actually trash");
				win=0;lose++;
				}
				
				
		//telling the user if the won and how much		
				win2=win2+win;
			
				System.out.println("You get $"+win+"!!!!");
				balance=balance+win;
				System.out.println("You new balance is $"+balance+"!!!!!");
		
		//If the user losses all money
				if (balance<=0) {System.out.println("Oh it looks like you ran out of money");
				System.out.println("You lost :("); break;
				}
				else {}
			
			
		//Asking the user if they want to continue
			System.out.println("Do you want to play again?");
			String usertry= input.next();
			if (usertry.equalsIgnoreCase("yes")){l=1;}
			else if (usertry.equalsIgnoreCase("no")) {System.out.println("Good Bye :( "); break;}
			else {System.out.println("Not a right input");l=1;}
	
//Loop ends	
	} while (l>=1); counter++;

	System.out.println("");
	System.out.println("Statistics:");
	System.out.println("");
	System.out.println("Wins:"+win3);
	System.out.println("Half Wins:"+win4);
	System.out.println("Losses:"+lose);
	System.out.println("Total spins:"+counter);
	System.out.println("Total money bet:"+bet3);
	System.out.println("Total money won:"+win2);
	System.out.println("Final balance:"+balance);
	System.out.println("Thanks for playing!!");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
