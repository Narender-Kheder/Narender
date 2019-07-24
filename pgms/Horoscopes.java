package pgms;
import java.util.Scanner;
public class Horoscopes {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("What mounth were you born in?");
		String m= input.next();
		
		System.out.println("what day of the month?");
		int d=input.nextInt();
		
		{
		if (m=="January") {
			if (d<20) {
				String h="Capricorn";
				System.out.println("Your horoscope is Capricorn.");
			}
			if (d>21) {
				String h= "Aquarius";
				System.out.println("Your horoscope is Aquarius.");
			}
		}
		
		else if (m== "Febuary") {
			if (d<19) {
				String h= "Aquarius";
				System.out.println("Your horoscope is Aquarius.");
			}
			if (d>20) {
				String h= "Pisces";
				System.out.println("Your horoscope is Pisces.");
			}
		}
		
		else if (m=="march") {
			 if (d<20) {
				 String h= "pisces";
			 }
			 if (d>21) {
				 String h= "Aries";
			 }
			 
		}
		
		else if (m== "April"){
			if (d < 20) { 
				String h="Aries";
			}
			if (d > 21) {
				String h= "Taurus";
			}
		}
		
		else if (m== "May"){
			if (d < 21) {
				String h= "Taurus";
			}
			if (d > 22) {
				String h= "Gemini";
			}
		}
		
		else if (m== "June"){
			if (d < 21) {
				String h= "Gemini";
			}
			if (d > 22) {
				String h= "Cancer";
			}
		}
		
		else if (m== "July"){
			if (d < 22) {
				String h="Cancer";
			}
			if (d > 23) {
				String h="leo";
			}
		}
		
		else if (m== "August") {
			if (d<22) {
				String h="leo";
			}
			if (d>23) {
				String h="Virgo";
			}
		}
		
		else if (m== "September") {
			if (d<22) {
				String h="Virgo";
			}
			if (d>23) {
				String h= "Libra";
			}
		}
		
		else if (m== "October") {
			if (d<22) {
				String h="Libra";
			}
			if (d>23) {
				String h="Scorpio";
			}
			
		}
		
		else if (m== "November") {
			if (d<22) {
				String h="Scorpio";
			}
			if (d>23) {
				String h="Sagittarius";
			}
		}
		
		else if (m== "December") {
			if (d<22) {
			    String h="sagittarius";
		    }
			if (d>23) {
				String h= "Capricorn";
			}
		}
		
		 
			
	
		
		
			
		
		
				
		
		
		

	}

}
}
