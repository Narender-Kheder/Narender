package pgms;
import java.util.*;
import java.io.*;
public class EstimationGame {
	static Scanner input= new Scanner(System.in);
	static int [] perArray;// array for all the percents
	
	public static void main(String[] args) throws FileNotFoundException {
	//questions();//calling the questions method
		int user2= 78;
		System.out.println("Welcome to the Estimation station!!!!"); //quick introduction
		System.out.println("Simple directions: enter in your number estimation, "
							+ "and get percent of error back");
		System.out.println("At the end get your over all percent, and see if you made the leader board! ");
		System.out.println("lets play!!");
		System.out.println("");
		System.out.println("Would you like to play or view the leader board first?");
		System.out.println("1: play now");   // giving the user some options
		System.out.println("2; view board then play");
		System.out.println("3: view board and exit");
		int i=0;    // variable for an infinite error check loop
		int entery = 0;
		while ( i==0){// taking the menu entery and error checking it
		System.out.println("Enter the menu option:");
		entery= input.nextInt();
		if (entery>= 1 && entery<=3) {break;}
		else{System.out.println("Incorrect option, try again");}}
		int num1= 11;
		switch(entery) {
		case 1: questions(); ;break;
		case 2: display(); questions(); ;break;
		case 3: display();;break;
		default: break;}
	
	
	
	}
	public static void questions() throws FileNotFoundException {// the questions for the user
		//questions:
		perArray= new int[10];
		System.out.println("");
		
		System.out.println("Lets start!");
		System.out.println("Question 1:");
		System.out.println("How many human body part names are only 3 letters long?");
		int q1= 10;						//right answer
		int a1= input.nextInt();		//user input
		int per1= perFinder(q1,a1);		//calling the method that finds percent error
		perArray[0]=per1;				//putting the percent into an array
		System.out.println(per1+"%");	//outputting the percent for the user
		
		System.out.println("what is the international telephone dialing code for Antarctica?");
		int q2= 672;					//all  the questions follow the same format
		int a2= input.nextInt();
		int per2= perFinder(q2,a2);
		perArray[1]=per2;
		System.out.println(per2+"%");
		
		System.out.println("How many calls does the average person make each year?");
		int q3= 1140;
		int a3= input.nextInt();
		int per3= perFinder(q3,a3);
		perArray[2]=per3;
		System.out.println(per3+"%");
		
		
		System.out.println("How many times are Men more likely to be struck by lightning than women?");
		int q4= 6;
		int a4= input.nextInt();
		int per4= perFinder(q4,a4);
		perArray[3]=per4;
		System.out.println(per4+"%");
		
		System.out.println("How many times can you fold a U.S. dollar bill in the same place before it will tear?");
		int q5= 400;
		int a5= input.nextInt();
		int per5= perFinder(q5,a5);
		perArray[4]=per5;
		System.out.println(per5+"%");
		
		System.out.println(" How far has the Earth traveled in the past 5 minutes?");
		int q6= 5000;
		int a6= input.nextInt();
		int per6= perFinder(q6,a6);
		perArray[5]=per6;
		System.out.println(per6+"%");
		
		System.out.println("How many calories does Banging your head against a wall burn an hour?");
		int q7= 150;
		int a7= input.nextInt();
		int per7= perFinder(q7,a7);
		perArray[6]=per7;
		System.out.println(per7+"%");
		
		System.out.println("How many miles of blood vessels are in the human body?");
		int q8= 60000;
		int a8= input.nextInt();
		int per8= perFinder(q8,a8);
		perArray[7]=per8;
		System.out.println(per8+"%");
		
		System.out.println("How many times does Lightning strikes the Earth every second?");
		int q9= 100;
		int a9= input.nextInt();
		int per9= perFinder(q9,a9);
		perArray[8]=per9;
		System.out.println(per9+"%");
		
		System.out.println("How many times faster does Sound through steel than through the air?");
		int q11= 15;
		int a11= input.nextInt();
		int per11= perFinder(q11,a11);
		perArray[9]=per11;
		System.out.println(per11+"%");
		
		results(perArray);//calling the method to output and get the final results
		
		
}
	public static void results(int[] perArray ) throws FileNotFoundException {//outputs the results
		System.out.println("Your answer accuracy percents:");
		
		for(int i=0; i<= perArray.length-1;i++ ) {
			System.out.print(i+":"+perArray[i]+"%"+ ", " );
		}
		System.out.println("\n");
		
		int overallper= overallPer(perArray);
		System.out.println("Your overall percent error is: "+ overallper+ "%");
		System.out.println("");
		leaderBoard(overallper);
	}
	public static int overallPer( int [] overallper) {//method to find overall percent error
		int per=0;
		for(int i=0; i<= overallper.length-1;i++ ) {
			per= per+ overallper[i];}
		int per1= (per*100)/(1000);
		return per1;
	}
	public static int perFinder( int real1,int user1) {// method to find the percent error fro each question
		int per=0;
		int user2= real1- user1;
		int per1= (user2*100)/(real1);
		per= Math.abs(per1);//math absolute just in case the guess is over and the percent is then a negative
		return per;}
	public static void leaderBoard(int num1) throws FileNotFoundException {// method for the leaderboard
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
/* extra stuff:
	 * cheats,100% answers:
		10, 672, 1140, 6, 400, 5000, 150, 60000, 100,15
	 
	 * default leader board:
	    Agarwal 50
		Patel 54
		Babu 56
		Varma 58
		Chowdhury 61
		Chadha 62
		Datta 64
		Deol 72
		Lal 80
		Joshi 95
 */