package pgms;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("Hi, enter your first numbers");
		double n1=input.nextDouble();
		
		System.out.println("Enter your second number");
		double n2=input.nextDouble();
		
		System.out.println("What would you like to do with your number?");
		System.out.println("1:Add'em");
		System.out.println("2:Subtract First from Second");
		System.out.println("3:Subtract second from first");
		System.out.println("4:Multiply");
		System.out.println("5:Divide first from second");
		System.out.println("6:Divide second from first");
		System.out.println("7:Raidse frist to the power of second");
		System.out.println("8:Raise second to the power of first ");
		System.out.println("9:Pythagreon Theorum( 2 short sides)");
		System.out.println("10:Volume of a pyramid.. first is base second is hight");

		int choice= input.nextInt();
		
		double solution;
		switch (choice) {
		
		case 1: solution= n1+n2; break;
		case 2: solution = n2-n1; break;
		case 3: solution = n1-n2; break;
		case 4: solution = n1*n2; break;
		case 5: solution = n1/n2; break;
		case 6: solution = n2/n1; break;
		case 7: solution = Math.pow(n1,n2); break;
		case 8: solution= Math.pow(n2,n1); break;
		case 9: solution= Math.sqrt(Math.pow(n1,2)+ Math.pow(n2, 2)); break;
		case 10: solution = Math.pow(n1, 2)*n2/3.0; break;
		default: solution= 999; System.out.println("Error"); break;
		}
		System.out.println(solution);
	}

}
