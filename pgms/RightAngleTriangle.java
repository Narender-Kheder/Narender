package pgms;
import java.util.Scanner;
public class RightAngleTriangle {

	static double c=0;
	static Scanner input= new Scanner (System.in);
		
	public static void main(String[] args) {
		
		angle();
		
	 }
	public static void angle() {
	System.out.println("What does side a equal?");
		double a = input.nextDouble();
		System.out.println("what does side b equal?");
		double b = input.nextDouble();
		double a1= Math.pow(a,2);
		double b1= Math.pow(b,2);
		double ab= a1+b1;
		 c = Math.sqrt(ab);		
				
		
		System.out.println("The hypotonuse of the triange is: " + c);
	}
}
	
			
			
			


