package pgms;
import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		System.out.println("What is your name?");
		String name= input.next();
		
		System.out.println("what is your first period class?");
		String class1=input.next();
		System.out.println("What is your grade in this class? ");
		double mark1=input.nextDouble();
		
		System.out.println("what is your second period class?");
		String class2=input.next();
		System.out.println("What is your grade in this class? ");
		double mark2=input.nextDouble();
		
		System.out.println("what is your third period class?");
		String class3=input.next();
		System.out.println("What is your grade in this class? ");
		double mark3=input.nextDouble();
		
		System.out.println("what is your fourth period class?");
		String class4=input.next();
		System.out.println("What is your grade in this class? ");
		double mark4=input.nextDouble();
		
		System.out.println(name + " these are your marks:");
		System.out.println("You got a "+mark1 +" in "+ class1+";");
		System.out.println("You got a "+mark2 +" in "+ class2+";");
		System.out.println("You got a "+mark3 +" in "+ class3+";");
		System.out.println("You got a "+mark4 +" in "+ class4+";");
		
		double mean= (mark1+mark2+mark3+mark4)/4;
		
		System.out.println("Your average is "+ mean+".");
		

	}

}
