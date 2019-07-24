package pgms;
import java.util.Scanner;
public class MovieRegister {

	public static void main(String[] args) {

		Scanner input= new Scanner (System.in);

		System.out.println("Welcome to the Theater!");
		System.out.println("Please enter your age:");
		int age=input.nextInt();
		int t= 0;

		// Age verification
		if (age <= 12 || age >= 65) { t= 8; System.out.println("Your ticket price is $"+ t);}
		else if (age >= 13 && age <= 64) { t=12; System.out.println("Your ticket price is $"+ t);}
		else { System.out.println("Error");}


		// AVX and Imax upgrades
		System.out.println("Would you like to upgrade your seat to AVX or Imax? Say no if your would like to dicline.");
		System.out.println("Type 1 for AVX, 2 for Imax, and 0 if you dicline");
		int upgrade= input.nextInt();
		double up=0;
		if (upgrade == 0) { up= 0+ t;}
		else if (upgrade ==  1) {  up= (t*0.25)+ t; }
		else if (upgrade== 2) { up= (t*0.35)+ t;}	
		else { System.out.println("Error"); }
		System.out.println("Your current total is $"+ up);


		// DBOX Upgrade
		System.out.println("Would you like to upgrade to a Dbox seat?");
		System.out.println("Type 1 for yes, or 2 for no");
		int dbox= input.nextInt();
		double up2= 0;
		if (dbox== 1) { up2=up+5;}
		else if (dbox==2)  { up2= up+0;}
		else {System.out.println("Error");}
		System.out.println("Your current total is $"+up2);

		// Concession stand
		System.out.println("Would you like to buy any snacks?");
		System.out.println("1. Small Popcorn-$3");
		System.out.println("2. Large Popcorn-$6");
		System.out.println("3. Small Drink-$3");
		System.out.println("4. Large Drink-$6");
		System.out.println("5. Small Bag of Candy-$3");
		System.out.println("6. Large bag of Candy-$6");
		System.out.println("7. Small Combo: Small Drink, Large Popcorn, Large Candy-$9");
		System.out.println("8. Large Combo: Large Drink, Large Popcorn, Large Candy-$18");
		System.out.println("0. No Snacks");
		System.out.println("Enter the number of the combo you will be selecting today");
		int s= input.nextInt();
		double a=0;
		switch (s) {
		case 1: a= 3; break;
		case 2: a=6; break;
		case 3: a=3; break;
		case 4: a=3; break;
		case 5: a=6; break;
		case 6: a=6; break;
		case 7: a=9; break;
		case 8: a=18; break;
		case 0: a= 0; break;
		default: a = 999;
		}
		double t1= up2+a;
		double t2= Math.round((t1/100.0)*100.0);
		System.out.println("Your current total is: $" + t1);

		// Total
		double t3= (t1*0.13)+t1;
		double total= Math.round(t3*100.0)/100.0;
		System.out.println(" Your final total is: $"+ total);
		System.out.println("Enter cash payment: ");
		double cash= input.nextDouble();
		double change= cash-total;
		double change2= Math.round(change*100.0)/100.0;
		System.out.println("Your change is: $"+ change2);

		double tw= Math.round(change/20);


		//Change
		double hun= change2%100;
		int hun1=(int) (change2/100);
		double fif= hun%50;
		int fif1= (int) (hun/50);
		double tw2= fif%20;
		int tw3= (int) (fif/20);
		double ten= tw2%10;
		int ten1= (int) (tw2/10);
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

		System.out.println("You change is as follows;");
		String s1 = "";

		if (hun1 > 0) {
			s1 = s1 + "Hundred Bill: " + hun1 + ",";}
		if (fif1 > 0) {
			s1 = s1 + " Fifty Bill: " + fif1 + ",";}
		if (tw3 > 0) {
			s1 = s1 + " Twenty Bill: " + tw3 + ",";}
		if (ten1 > 0) {
			s1 = s1 + " Ten Bill: " + ten1 + ",";}
		if (fv1 > 0) {
			s1 = s1 + " Five Bill: " + fv1 + ",";}
		if (too1 > 0) {
			s1 = s1 + " Toonie: " + too1 + ",";}
		if (lo1 > 0) {
			s1 = s1 + " Loonie: " + lo1 + ",";}
		if (q1 > 0) {
			s1 = s1 + " Quarter: " + q1 + ",";}
		if (d1 > 0) {
			s1 = s1 + " Dime: " + d1 + ",";}
		if (n1 > 0) {
			s1 = s1 + " Nickle: " + n1 + ",";}
		if (p1 > 0) {
			s1 = s1 + " Penny: " + p2+  ",";}
		else System.out.println("Error");


		System.out.println(s1);















	}
}
