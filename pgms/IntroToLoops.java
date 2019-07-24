package pgms;
import java.util.Scanner;
public class IntroToLoops {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.println("Enter a starting value");
		int start= input.nextInt();
	
		System.out.println("Enter a ending value");
		int end= input.nextInt();
		
		int counter = start;
		
		do {
			System.out.println("the squar root of "+ counter+ " is "+ Math.sqrt((double) counter));
			counter++; 
		} while (counter <= end);
		
		counter=start;
		while( counter <= end) {
			System.out.println("the squar root of "+ counter+ " is "+ Math.sqrt((double) counter));
			counter++;
		}
		
		if (start%2==0)  
		do {
		  System.out.println("The odd numbers are " +counter);
			counter++;} while (counter <= end);
			
	
		else if (start%1==0)		
		do {
		  System.out.println("The odd number are "+ counter);
			counter++;} while (counter<=end);
	
		
		

	}

}
