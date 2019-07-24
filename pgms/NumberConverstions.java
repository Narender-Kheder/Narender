package pgms;
import java.util.*;
public class NumberConverstions {
	static Scanner input= new Scanner(System.in);
	static String value1;
	public static void main(String[] args) {
		//Introduction and giving the user options
		System.out.println("Welcome to the Number Converter!!!");
		System.out.println("Menu:");
		System.out.println("1.Decimal to Bianary");
		System.out.println("2.Binary to Decimal");
		System.out.println("3.Hex to Decimal");
		System.out.println("4.Decimal to Hex");
		System.out.println("5.Hex to Binary");
		System.out.println("6.Binary to Hex");
		System.out.println("Enter the menu option:");
		//error checking the option menu
		for (int i = 0; i > -1;) {
			int option = input.nextInt();
			if (option >= 1 && option <= 6) {
				switch (option) {//option menu
				case 1:checkDecimal();decimalToBinary(value1); ;break;
				case 2:checkBinary();binaryToDecimal(value1); ;break;
				case 3:checkHex();hexToDecimal(value1); ;break;
				case 4:checkDecimal();decimalToHex(value1); ;break;
				case 5:checkHex();hexToBinary(value1); ;break;
				case 6:checkBinary();binaryToHex(value1); ;break;
				default:System.out.println("incorrect input, enter again");}break;}
			else {System.out.println("Incorrect input, enter again");}
		}	
}
	public static void decimalToBinary(String user) {// To convert from decimal to binary
		int dec1 = Integer.parseInt(user);
		int left;
		String out1 = "";
		
		// loop to determine the values at the certain locations
		for(int j=0; j < dec1;) {
			left = dec1%2; 
			dec1 = dec1/2; 
			out1 = out1.concat(left + ""); 
		}
		//Outputting the converted form
		int length1= out1.length();
		System.out.println("This is "+ value1 + " converted:");
		String out2= new StringBuffer(out1).reverse().toString();//method writes strings backwards
		System.out.println(out2);
}
	public static void binaryToDecimal(String user) {// To convert from binary to decimal
		char[] binary1= user.toCharArray();//array declared
	 	int out1 = 0; 
		int value2; 
		
		//loop to go through the array
		for (int x = 0; x < binary1.length ; x++) {
			value2 = Character.getNumericValue(binary1[x]); 
			int length1=binary1.length;
			int length2=length1-x-1;
			out1 = out1 + value2* (int) (Math.pow(2,length2));			
		}
		//output
		System.out.println("This is "+ value1 + " converted:");
		System.out.println(out1);
}
	public static void hexToDecimal(String user) {// To convert from binary to decimal
		//array declared
		char[] hex1 = user.toCharArray();
		int[] hex2 = new int [hex1.length];//later filled with int values of the hex1 array
		//changing the chars to int/number values
		for (int i= 0; i < hex1.length; i++) {
			char l=0; 
			switch(hex1[i]) {
			case '0':l=0;break;
			case '1':l=1;break;
			case '2':l=2;break;
			case '3':l=3;break;
			case '4':l=4;break;
			case '5':l=5;break;
			case '6':l=6;break;
			case '7':l=7;break;
			case '8':l=8;break;
			case '9':l=9;break;
			case 'A':l=10;break;
			case 'B':l=11;break;
			case 'C':l=12;break;
			case 'D':l=13;break;
			case 'E':l=14;break;
			case 'F':l=15;break;
			case 'a':l=10;break;
			case 'b':l=11;break;
			case 'c':l=12;break;
			case 'd':l=13;break;
			case 'e':l=14;break;
			case 'f':l=15;break;
			default:System.out.println("Error, entered value is not hex");
			}
			hex2[i]=l;
		}
		int out1 = 0; 
		int value2; 
		
		//loop to go through the array
		for (int x = 0; x < hex2.length ; x++) {
			value2 = hex2[x];
			int length1=hex2.length;
			int length2=length1-x-1;
			out1 = out1 + value2* (int) (Math.pow(16,length2));			
		}
		//output
		System.out.println("This is "+ value1 + " converted:");
		System.out.println(out1);
}
	public static void decimalToHex(String user) {// To convert from decimal to binary
		int dec1 = Integer.parseInt(user);
		int left;
		String out1 = "";
		String l=""; 
		// loop to determine the values at the certain locations
		do {	
			left = dec1%16; 
			switch(left) {//converting to string values or letter
			case 0:l="0";break;
			case 1:l="1";break;
			case 2:l="2";break;
			case 3:l="3";break;
			case 4:l="4";break;
			case 5:l="5";break;
			case 6:l="6";break;
			case 7:l="7";break;
			case 8:l="8";break;
			case 9:l="9";break;
			case 10:l="A";break;
			case 11:l="B";break;
			case 12:l="C";break;
			case 13:l="D";break;
			case 14:l="E";break;
			case 15:l="F";break;
			default:System.out.println("Error, output value is not hex");
			}
			out1 = out1.concat(l+""); 
			dec1 = dec1/16;
		}while (dec1>0);
		
		//Outputting the converted form
		int length1= l.length();
		System.out.println("This is "+ value1 + " converted:");
		String out2= new StringBuffer(out1).reverse().toString();
		System.out.println(out2);
}
	public static void hexToBinary(String user) {// To convert from binary to decimal
		//first convert to decimal then to binary
		char[] hex1 = user.toCharArray();//array declared
		int[] hex2 = new int [hex1.length];//later filed with int values of hex1
		for (int i= 0; i < hex1.length; i++) {
			char l=0; 
			switch(hex1[i]) {
			case '0':l=0;break;
			case '1':l=1;break;
			case '2':l=2;break;
			case '3':l=3;break;
			case '4':l=4;break;
			case '5':l=5;break;
			case '6':l=6;break;
			case '7':l=7;break;
			case '8':l=8;break;
			case '9':l=9;break;
			case 'A':l=10;break;
			case 'B':l=11;break;
			case 'C':l=12;break;
			case 'D':l=13;break;
			case 'E':l=14;break;
			case 'F':l=15;break;
			case 'a':l=10;break;
			case 'b':l=11;break;
			case 'c':l=12;break;
			case 'd':l=13;break;
			case 'e':l=14;break;
			case 'f':l=15;break;
			default:System.out.println("Error, entered value is not hex");
			}
			hex2[i]=l;
		}
		int out1 = 0; 
		int value2; 
		
		//loop to go through the array
		for (int x = 0; x < hex2.length ; x++) {
			value2 = hex2[x];
			int length1=hex2.length;
			int length2=length1-x-1;
			out1 = out1 + value2* (int) (Math.pow(16,length2));			
		}
		//out1 is in decimal, and needs to be converted into binary, so call upon that method
		String out2= String.valueOf(out1); // needs to be converted to string first
		decimalToBinary(out2);
	}
	public static void binaryToHex(String user) {// To convert from binary to decimal
		//convert to decimal first then to hex, output hex
		// Initiating an array
		char[] binary1 = user.toCharArray();//array declare
		int out1 = 0; 
		int value2; 
		//loop to go through the array
		for (int x = 0; x < binary1.length ; x++) {
			value2 = Character.getNumericValue(binary1[x]); 
			int length1=binary1.length;
			int length2=length1-x-1;
			out1 = out1 + value2* (int) (Math.pow(2,length2));			
		}
		//out1 is decimal and must be converted into hex, so call open that method
		String out2= String.valueOf(out1);//need to change to string first
		decimalToHex(out2);
		}
    public static String checkDecimal() {//to check decimals inputs
		boolean check; long dec1 = 0;
		do { System.out.println("Enter decimal:");
			value1= input.next();
			try {check=true; dec1 = Long.parseLong(value1);}       
		    catch (Exception e) {System.out.println("Invalid entry, try again");check= false;}
	    }while(check==false);
		return value1;
    }
    public static String checkBinary() {//to check binary inputs
    	 char[] binary1;
 		 int ic=0;
 			do{ System.out.println("Enter binary sequence:");
 				value1= input.next(); ic=0;
 				binary1 = value1.toCharArray();//array declared
 				for(int i =0; i < binary1.length;i++) {	
 					if (binary1 [i] == '0'|| binary1[i] == '1' ){}
 					else {ic++; }}
 				if(ic==0) {break;}	
 				else {}
 			}while(ic!=0);
 			return value1;
    }
    public static String checkHex() {// to check hex inputs
    	//error checking
		boolean check; int ic=0;//an accumulator to check for incorrect chars
		char[] hex1;//declaring a char array for the int
		do{ System.out.println("Enter Hex sequence:");
			value1= input.next();ic=0;
			hex1 = value1.toCharArray();//array declared
			for(int i =0; i < hex1.length;i++) {	
				if (hex1 [i] == '0'|| hex1[i] == '1'|| hex1[i] =='2'|| hex1[i] =='3'|| hex1[i] =='4'
						|| hex1[i] =='5'|| hex1[i] =='6'|| hex1[i] == '7'|| hex1[i] =='8'|| hex1[i] =='9'
						|| hex1[i] =='A'|| hex1[i] =='B'|| hex1[i] =='C'|| hex1[i] =='D'
						|| hex1[i] =='E'|| hex1[i] =='F'|| hex1[i] =='a'|| hex1[i] =='b'|| hex1[i] =='c'|| 
						hex1[i] =='d'|| hex1[i] =='e'|| hex1[i] =='f'){}//all the chars for a hex system
				else {ic++; check=false;}}//not one of those hex chars so ic++
			if(ic==0) {;break;}	
			else {check= false;}
		}while(ic!=0);
		return value1;
    }
}//class end