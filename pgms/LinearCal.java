package pgms;
import java.util.Scanner;
public class LinearCal {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		System.out.println("What is the slope for your line?");
		double m = input.nextDouble();
		
		System.out.println("What is the x value?");
		double x = input.nextDouble();
		System.out.println("What is b value?");
		double b = input.nextDouble();
		double y = (m)*x+b;
		
		System.out.println("The Y value is equal to "+ y);
			
				
				

	}

}
