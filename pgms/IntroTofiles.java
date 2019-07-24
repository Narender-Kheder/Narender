package pgms;

import java.util.Scanner;
import java.io.*;   // <-- NOW we have to import a second package. 
					//This allows us to work with files

public class IntroTofiles {

	public static void main(String[] args) throws FileNotFoundException {
		
		writeNumbers();
		readFile();
	}
	
	/**
	 * This method will write 10 random numbers into a file.
	 * @throws FileNotFoundException 
	 */
	public static void writeNumbers() throws FileNotFoundException {
		
		int[] randos = new int[10];
		//populate the array with random numbers from 1 to 100;
		for (int i = 0 ; i < randos.length ; i++) {
			randos[i] = (int) (Math.random()*100+1);
		}
		
		//Now create a file object
		//This will create a blank file called test.txt in the project folder
		File test1 = new File("test.txt");
		
		//In order to WRITE to the above file, we have to use a print writer object
		PrintWriter pw = new PrintWriter(test1); 
		
		//Now write the 10 integers to the file
		for (int j = 0 ; j < randos.length ; j++) {
			pw.println(randos[j]);
		}
		
		//finally, when you're done writing to the file, you have to FLUSH and CLOSE the print
		// writer. Don't ask me why.. it's just a java thing.
		pw.flush();
		pw.close(); 
	}
	
	/**
	 * Now we'll learn how to read from an existing file
	 * @throws FileNotFoundException 
	 */
	public static void readFile() throws FileNotFoundException {
		//Create a new File object
		File toBeRead = new File("test.txt"); // <-- Whatever you saved your file as
		
		//We will use another SCANNER object to read from the file instead of the keyboard
		Scanner fileIn = new Scanner(toBeRead); 
		
		//Get the first 5 words from the file
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(fileIn.next()); //will print the next word from the file
												// to the screen
		}
		
		//if you don't know how many lines are in the file, we can set up a loop
		//based on the "hasNext()" function
		while (fileIn.hasNext()) {
			System.out.println(fileIn.nextInt()); //will print the next 5 (or more) integers
													//to the screen
		}
		
	}

}
