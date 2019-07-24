package pgms;
import java.lang.reflect.Array;
import java.util.Scanner;

public class MeanMedianMode {
static Scanner input= new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter array length");
		int length1= input.nextInt();
		System.out.println("Enter the max for the random numbers");
		int max1= input.nextInt();
		
		int[] array1;
		array1= new int[length1];
		
		
		
		
		randos(array1, max1);
		mean(array1);
	}

	
	public static void randos(int[] array1,int max1) {
		
		
		for ( int i=0; i< array1.length; i++) {
			int rand= (int) (Math.random()*max1+1);
			array1[i]=rand;
			System.out.println(array1[i]);
		}
	}
	
	public static void mean(int[] array2) {
		double add1=0;
		
		for (int j=0; j< array2.length; j++) {
			add1= add1+array2[j];
			}
		
		double mean1= add1/(array2.length);
		System.out.println("Add1="+add1);
		System.out.println("Average="+mean1);
	}
	
	public static void mode() {
		
	}
	
	
	
	
	
	
	
	
	
}
