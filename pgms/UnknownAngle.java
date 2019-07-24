package pgms;
import java.util.Scanner;
public class UnknownAngle {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
	
		System.out.println("What does angle a equal to?");
		double a= input.nextDouble();
		System.out.println("What does angle b equal to?");
		double b= input.nextDouble();
		System.out.println("What does angle c equal to? ");
		double c=0;
		
		double c1= 180-(a+b);
		double b1 = 180-(a+c);
		double a1= 180-(b+c);
		
		if (a!= 0)	{
			if (c == 0)
				System.out.println("The c angle is "+c1);
			if (b== 0)
				System.out.println("The b angle is "+b1 );
	}
		else 
			System.out.println("The a angle is "+ a1);
			
				
		
		
		

	}

}
