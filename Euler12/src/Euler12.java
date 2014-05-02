
public class Euler12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long counter = 0, triangle =0, divisors = 500;
		boolean complete = false;
		
		do {
			counter++;
			triangle += counter;
			if (numDivisor(triangle) >= divisors )	
			{ complete = true; System.out.printf("Lowest Triangle to have %d or more divisors is %d", divisors, triangle);	}
		} while(!complete);
		

	}
	public static long numDivisor(long check)
	{
		long totalDivisors = 0, counter = 0;
		for (counter = 1; counter <= check; counter++)
		{
			if (check % counter == 0)	{	totalDivisors++;	}
		}		
		return totalDivisors;
	}

}
