package pgms;

public class Q21{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accumulator=0;
		int answer=0;
	
		for (int i= 0; i<10; i+=2) {	
			answer= (int) Math.pow(i,2);
			System.out.println(answer);
			accumulator= accumulator+answer;
			}
		System.out.println("");
		System.out.println(accumulator);
	
	
	
	
	
	
	}

}
