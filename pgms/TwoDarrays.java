package pgms;
import java.util.Scanner;
public class TwoDarrays {
static Scanner input= new Scanner (System.in);
	public static void main(String[] args) {
		
	System.out.println("What start value?");
	int start= input.nextInt();
	
	System.out.println("End value:");
	int end= input.nextInt();
	
	System.out.println("what exponent?");
	int exp= input.nextInt();
	
	
	int numberofrows=end-start +1;
	int [][] powers= new int[numberofrows] [3];
	
	
	for (int i=0 ; i< powers.length; i++) {
		powers[i] [0]= start+i;
		powers[i] [1]=exp;
		powers[i][2] =(int) ( Math.pow(powers[i] [0], powers[i][1])) ; 
		}
		
	for (int j=0; j< powers.length; j++) {
		System.out.println(powers[j][0] +"^"+powers[j][1]+"="+powers[j][2]);
	}
		
		
		
	}

}
