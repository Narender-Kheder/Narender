package pgms;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;
public class Openspace3 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Would you like to play or view the leader board first?");
		System.out.println("1: play now");
		System.out.println("2; view board then play");
		System.out.println("3: view board and exit");
		int i=0;
		int entery = 0;
		while ( i==0){
		System.out.println("Enter the menu option:");
		entery= input.nextInt();
		if (entery>= 1 && entery<=3) {break;}
		else{System.out.println("Incorrect option, try again");}}
		int num1= 11;
		switch(entery) {
		case 1: ;break;
		case 2: display(); ;break;
		case 3: display();;break;
		default: break;}
		
		
	}
		
		
	
	public static void leaderBoard(int num1) throws FileNotFoundException {
		
		
		
		
		int[] num12= new int [10];// an int array for the leader board scores
		
		File leaderboard= new File("LeaderBoard.txt");		//calling/ creating file
		Scanner boardIn= new Scanner(leaderboard);		    // reading the file
		String [][] board= new String[10][2];				// string array for the leader board
		
		for( int i=0; i <= board.length-1; i++) {//populating the array with the string values
			for( int j=0; j<=1;j++) {board[i][j]= boardIn.next();}
		}
	
		
		//outputting the leaders
		System.out.println("The leaders:");
		for(int i=0; i<=9;i++) {
			System.out.println("Rank "+(i+1)+" is: " + board[i][0] + " with a best score of "+ board[i][1]+"%");}
		// puts the scores into an int array
		for(int i=0; i<=9;i++) {num12[i]= Integer.parseInt(board[i][1]);}
	
		if(num1 <= (num12[9])){// if else checking if you even made the leader board
			
			// check where on the leader board you are
			int k= 9;// array position 
			int l=11;// actual leader board position
			while( num1 <= num12[k] && k != -1) {
				l--;
				k--;
				if(k== -1) {k++;break; }
			}	
				
			l--;// used as array location rather then leader board position
			
				// fixing the array for the new values
			for(int i=9; i>= l; i--)  {
				if( i==0) {break;}
				num12[i]= num12[i-1]; }
			
			num12[l]=num1;// putting the score into the int array
		
			for(int i=0; i<=9;i++) {// putting the values into the string array
				board[i][1]= Integer.toString(num12[i]); }
			
			System.out.println("");
			System.out.println(" Your rank:"+(l+1));
			System.out.println(" Your score:"+num1+"%");
			
			System.out.println("Enter a username:"); // asking user of name
			board[l][0]= input.next();// putting the user name into the string array
			//outputting the leaders
			System.out.println("");
			System.out.println("The leaders:");
			for(int i=0; i<=9;i++) {
				System.out.println("Rank "+(i+1)+" is: " + board[i][0] + " with a best score of "+ board[i][1]+"%");}
			
		}
		
		else {
			System.out.println("");
			System.out.println("Sorry, you did not make the leader board :("); 
		System.out.println("Your score: "+ num1+"%");}
		

		PrintWriter fileIn= new PrintWriter(leaderboard);
	
		for (int i=0; i<=9; i++) {
			fileIn.println(board[i][0]+" "+ board[i][1]);
		}
	
		fileIn.flush();
		fileIn.close();
	}

	public static void display() throws FileNotFoundException {// displays the board
		File leaderboard= new File("LeaderBoard.txt");		//calling/ creating file
		Scanner boardIn= new Scanner(leaderboard);		    // reading the file
		String [][] board= new String[10][2];				// string array for the leader board
		
		for( int i=0; i <= board.length-1; i++) {//populating the array with the string values
			for( int j=0; j<=1;j++) {board[i][j]= boardIn.next();}
		}
		//outputting the leaders
		System.out.println("The leader board:");
		for(int i=0; i<=9;i++) {
			System.out.println("Rank "+(i+1)+" is: " + board[i][0] + " with a best score of "+ board[i][1]+"%");}
		
	}

}
