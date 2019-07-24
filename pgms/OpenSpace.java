package pgms;
import java.util.Scanner;
import java.util.Random;
import java.util.Random; 
public class OpenSpace {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		Random rand = new Random();
		
		String user=input.next();
		if (user.equals("yes")) {System.out.println("Yes");
		}
		else if (!user.equals("yes")) {System.out.println("no");}
	}
}