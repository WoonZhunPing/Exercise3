
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		WhileLoop();
		DoWhileLoop();
	}
	
	public static void WhileLoop() {
		
		int sum = 0; 
		double average;
		
		int lowerbound = 1;
		int upperbound = 100;

		int number = lowerbound;
		while (number <= upperbound) {
		
			sum += number; 
			number++;
		}
		
		double lower = Double.valueOf(lowerbound);
		double upper = Double.valueOf(upperbound);
		
		average =  (lower + upper)/2;
		
		System.out.println("The sum of " + lowerbound + " to "+ upperbound + " is " + sum);
		System.out.println("The average value of " + lowerbound + " to "+ upperbound + " is " + average);
	}
	
	
	public static void DoWhileLoop() {
		
		int sum = 0; 
		double average;
		
		int lowerbound = 1;
		int upperbound = 100;

		int number = lowerbound;
		do {
		
			sum += number; 
			number++;
			
		}while(number <= upperbound);
		
		double lower = Double.valueOf(lowerbound);
		double upper = Double.valueOf(upperbound);
		
		average =  (lower + upper)/2;
		
		System.out.println("The sum of " + lowerbound + " to "+ upperbound + " is " + sum);
		System.out.println("The average value of " + lowerbound + " to "+ upperbound + " is " + average);
		
	}

}
