package pgms;

public class Freespace_Array {

	
		
	public static void main(String[] args) {
		        
		        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
		            'i', 'n', 'a', 't', 'e', 'd'};
		            
		        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 5, 7);
		        
		        System.out.println(new String(copyTo));
		    }
		

	}


