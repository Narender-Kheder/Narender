package pgms;
import java.util.Scanner;
public class DiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		System.out.println("What is the original price of the item?");
		double p1= input.nextDouble();
		
		System.out.println("Is this item on sale?");
		String s=input.next();
		String y="yes";
		String n= "no";
		
				
		
		if (s == "no"){
		  System.out.println("What is the discount  price?");
		  double p2= input.nextDouble();
		  double p3= p2-(p2*0.13);
		  System.out.println(" 1Your final price is "+ p3);
		}
		
		else {
			
			 if (p1 >= 10);
			System.out.println("You get a 10% discount");
			double p4= p1-(p1*.1);
			double p5= p4-(p4*0.13);
			System.out.println("2your final price is "+ p5);
			 
			
			
			 if (p1 < 10);{
			double p6= p1-(p1*0.13);
			System.out.println("3Your final price is "+p6);
			
			 }
		
		
			
		
		

	}
	}
}


