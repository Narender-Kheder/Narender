package pgms;
import java.util.Scanner;
public class Yloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		double change= input.nextDouble();
		
		//double change = 240;
		double hun= change%100;
		int hun1=(int) (change/100);
		double fif= hun%50;
		int fif1= (int) (hun/50);
		double tw= fif%20;
		int tw1= (int) (fif/20);
		double ten= tw%10;
		int ten1= (int) (tw/10);
		double fv= ten%5;
		int fv1= (int) (ten/5);
		double too= fv%2;
		int too1= (int) (fv/2);
		double lo= too%1;
		int lo1= (int) (too/1);
		double q= lo%0.25;
		int q1= (int) (lo/0.25);
		double d=q%0.1;
		int d1=(int) (q/0.1);
		double n=d%0.05;
		int n1= (int) (d/0.05);
		double p=n%0.01;
		double p1= n/0.01;
		double p2= Math.round(p1);
		
		String s = "";
		
		if (hun1 > 0)
			s = s + "Hundred Bill: " + hun1;
		if (fif1 > 0)
				s = s + ", Fifty Bill: " + fif1;
		if (tw1 > 0)
			s = s + ", Twenty Bill: " + tw1;
		if (ten1 > 0)
			s = s + ", Ten Bill: " + ten1;
		if (fv1 > 0)
			s = s + ", Five Bill: " + fv1;
		if (too1 > 0)
			s = s + ", Toonie: " + too1;
		if (lo1 > 0)
			s = s + ", Loonie: " + lo1;
		if (q1 > 0)
			s = s + ", Quarter: " + q1;
		if (d1 > 0)
			s = s + ", Dime: " + d1;
		if (n1 > 0)
			s = s + ", Nickle: " + n1;
		if (p1 > 0)
			s = s + ", Penny: " + p2;
		else System.out.println("Error");

		
		System.out.println(s);
		
			
		
	}

}

