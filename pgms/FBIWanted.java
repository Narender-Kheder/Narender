package pgms;
import java.util.*;
import java.io.*;
public class FBIWanted {static String value1;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] arg) throws FileNotFoundException {
	
	System.out.println("These are the Ten Most Wanted!!!!!!!!!");//intro to user
	System.out.println("Be wary!!!!!");
	System.out.println("Shoot on sight!");
	System.out.println("");
	
	File datas= new File("firstName.txt");	//calling/creating the file the first name file
	Scanner dataIn= new Scanner(datas);		//Reading the file
	File data2= new File("lastNames.txt");	//calling/ creating the last name file
	Scanner dataIn2= new Scanner (data2);	//reading the file

	String [][] array1= new String[10][2];	//creating a String array for the names
	
	//populating the array with first names (array[i][0])
	for( int i= 0; dataIn.hasNext();i++ ) {array1[i][0]= dataIn.next();}
	//populating the array with last names (array[i][1])
	for( int i= 0; dataIn2.hasNext();i++ ) {array1[i][1]= dataIn2.next();}
	
	//out putting the array
	for( int i=0; (array1.length)-1 >=i; i++) {
		System.out.println("Rank "+ (i+1)+ ": "+ (array1[i][0])+" "+(array1[i][1]));}
	
	}
}
