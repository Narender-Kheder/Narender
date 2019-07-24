package pgms;
import java.util.Scanner;
import java.util.Arrays;
public class Minesweeper {
	static Scanner input= new Scanner(System.in);
	static int length=0;
	static int width=0;
	static int bomb1=0;
	static char[][] grid ;

	public static void main(String[] args) {

		intro();
		bombs(length, width, bomb1, grid);
		assignment(length, width, grid);

		//Out putting the board
		String separator="--";
		
		for (int j = 0; j < length; j++) {String separator2 ="";
			System.out.print("|");
			for (int o=0; o< width; o++) {
				System.out.print(grid[j][o]);
				System.out.print("|");
				separator2= separator+ separator2;
			}
			System.out.println("\n"+separator2);
		}
		
	}
	
	
	public static char[][] intro() {
	
	// Introduction
		System.out.println("Hello, Welcome To Minesweeper!");
		System.out.println("Enter your grid dimensions");

	// Asking the user the parameters
		System.out.println("Length:");
		length = input.nextInt();

		System.out.println("Width:");
		width = input.nextInt();
	// Asking user number of bombs and error checking it
		do {
		System.out.println("How many bombs do you want?");
		bomb1 = input.nextInt();
		if (bomb1 <= (length*width)) {break;}
		else {System.out.println("Incorrect number of bombs entered. Try again.");}
		}while(bomb1 > (length*width));

	// Initiating and returning the array 

		 return grid = new char[length][width];
		

	}
	
	
	
	
	
	
	
	public static void bombs(int length,int width, int bomb1,char [][] grid) {		
		
		
		//assigning a default to the board
		for (int k = 0; k < length; k++) {
			for (int l = 0; l < width; l++) {
				grid[k][l] = '0';
			}
		}
		
		// Putting random bombs on the board
				for (int i = 0; i < bomb1;) {
					int rand1 = (int) (Math.random() * (length));
					int rand2 = (int) (Math.random() * (width));

					if (grid[rand1][rand2] == '0') {
						grid[rand1][rand2] = 'X';
						i++;
					}
				}
	}
	
		
	
	
	
	public static void assignment(int length, int width,char [][] grid ) {
// reading the board and assigning the location with the right value

		
		for (int y = 0; y < length; y++) {
				for (int x = 0; x < width; x++) {
					if (grid[y][x] != 'X') {
						int hint1 = 48;

						for (int f = -1; f <= 1; f++) {
							int s = y + f;
							for (int g = -1; g <= 1; g++) {
								int s1 = x + g;

								if (s >= 0 && s <= (length - 1) && s1 >= 0 && s1 <= (width - 1)) {

									if (grid[s][s1] == 'X') {
										hint1++;
									} else {
									}
								}

							}

						}
						grid [y][x] = (char) hint1;
					}

				}
			}
	}
			

	
	
	
	
}


