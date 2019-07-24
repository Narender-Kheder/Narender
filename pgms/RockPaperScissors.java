package pgms;
import java.util.Scanner;

public class RockPaperScissors {

//Variables	
static Scanner input= new Scanner (System.in);
static int userwin=0;
static int compwin=0;
static int tie=0;
static String comp;
static String user;
static int counter;
static int i;

	
	public static void main(String[] args) {
	//calling on the greetings method 
		greetings();
		
		
//the loop for the game
	for ( i=1; i<=5;) {
	results();
	System.out.println("");
	if (compwin==3 || userwin==3) {break;}
	
	}
	
	
	if (compwin==3 ) {System.out.println("You lost ! Computor wons :( ");}
	else if ( userwin==3) {System.out.println("You won!!!!!!!!!!!");}
	System.out.println("Game over. Thanks for playing!");
	System.out.println("");
	System.out.println("Stats:");
	System.out.println("The computer had "+compwin+" Wins");
	System.out.println("You had "+userwin+" wins!");
	System.out.println("There were "+tie+ " ties");
	
	}

//Method for user greetings and rules
	public static void greetings() {
		System.out.println("Hello!!!!!!!!!");
		System.out.println("Welcome to Rock, Paper,Scissors, Lizard and Spock!");
		System.out.println("How scoring works:");
		System.out.println("You get a point if you win");
		System.out.println("The CPU gets a point if you lose");
		System.out.println("No one gets a point for a tie");
		System.out.println("The game is best out of five");
		System.out.println("but if there is a tie, you try that play again");
	    System.out.println("How it works:");
		System.out.println("Scissors cuts Paper\r\n" + 
				"Paper covers Rock\r\n" + 
				"Rock crushes Lizard\r\n" + 
				"Lizard poisons Spock\r\n" + 
				"Spock smashes Scissors\r\n" + 
				"Scissors decapitates Lizard\r\n" + 
				"Lizard eats Paper\r\n" + 
				"Paper disproves Spock\r\n" + 
				"Spock vaporizes Rock\r\n" + 
				"Rock crushes Scissors");
		System.out.println("LETS PLAY!!!!!!!!");
		System.out.println("");
		return;
	}
	
//Method for assign numbers to strings
	public static String compThrow() {
		int rand= (int) (Math.random()*5+1);
		
		switch (rand) {
		case 1:comp= "Rock";break;
		case 2:comp="Paper";break;
		case 3:comp="Scissor";break;
		case 4:comp="Lizard";break;
		case 5:comp= "Spock";break;
		default:break;
		}
		
		System.out.println("The computers throw is "+comp);
		return comp;
	  }
	

//asking the user their throw
	public static String userThrow() {
		
		System.out.println("Enter the hand you would like to throw:");
		System.out.println("Type Rock, Paper, Scissor, Lizard or Spock");
		String user=input.next();
		return user;
		
	}
	
	
	
//Method for obtaining the results	
	public static void results() {
		String user1=userThrow();
		String comp1=compThrow();
		
		//if tie
		if (user1.equalsIgnoreCase(comp1)) {tie++; System.out.println("It was a tie!!!! No wins granted");}
		
		//if computer wins, meaning that the user lost, the cpu's throw is superior 
		else if ((user1.equalsIgnoreCase("Scissor"))&& (comp1.equalsIgnoreCase("Spock"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Spock"))&& (comp1.equalsIgnoreCase("Lizard"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Lizard"))&& (comp1.equalsIgnoreCase("Rock"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Rock"))&& (comp1.equalsIgnoreCase("Paper"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Paper"))&& (comp1.equalsIgnoreCase("Scissor"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Rock"))&& (comp1.equalsIgnoreCase("Spock"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Spock"))&& (comp1.equalsIgnoreCase("Paper"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Paper"))&& (comp1.equalsIgnoreCase("Lizard"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Lizard"))&& (comp1.equalsIgnoreCase("Scissor"))) {compwin++;i++;System.out.println("You lost :(");}
		else if ((user1.equalsIgnoreCase("Scissor"))&& (comp1.equalsIgnoreCase("Rock"))) {compwin++;i++;System.out.println("You lost :(");}
		
		
		
		//if user wins, the cpu losses, the user's throw is superior
		else if ((user1.equalsIgnoreCase("Paper"))&& (comp1.equalsIgnoreCase("Rock"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Rock"))&& (comp1.equalsIgnoreCase("Lizard"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("lizard"))&& (comp1.equalsIgnoreCase("Spock"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Spock"))&& (comp1.equalsIgnoreCase("Scissor"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Scissor"))&& (comp1.equalsIgnoreCase("Paper"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Rock"))&& (comp1.equalsIgnoreCase("Scissor"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Scissor"))&& (comp1.equalsIgnoreCase("Lizard"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Lizard"))&& (comp1.equalsIgnoreCase("Paper"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Paper"))&& (comp1.equalsIgnoreCase("Spock"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		else if ((user1.equalsIgnoreCase("Spock"))&& (comp1.equalsIgnoreCase("Rock"))) {userwin++;i++;System.out.println("You won!!!!!!!");}
		
		//error
		else {System.out.println("Come on.... give a valid entry");}
		
		
		}
	
}
	
	



