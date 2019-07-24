package pgms;
import java.util.*;
import java.io.*;
public class Openspace1 {static String value1;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] arg) throws FileNotFoundException {
	
		int user2=78;
		File leaderboard= new File("LeaderBoard.txt");		//calling/ creating file
		Scanner boardIn= new Scanner(leaderboard);			//reading the file	
		String [][] boardarray= new String [10][2];			//creating the array 
		
		for( int i=0; i <= boardarray.length-1; i++) {//populating the array with the string values
			for( int j=0; j<=1;j++) {boardarray[i][j]= boardIn.next();}
		}
	
		int [] numboard= new int[10];
		
		for(int i=0; i<= boardarray.length-1; i++) {
			numboard[i]= Integer.parseInt(boardarray[i][1]);
		}
		int k= 9; 
		int l=10;
		while( user2 < (numboard[k])) {
			l--;
		}
		
		System.out.println(l);
		System.out.println(Arrays.toString(numboard));
		System.out.println(Arrays.deepToString(boardarray));
	
	}
}
