
public class Euler {
	
	public static void main (String args[])
	{
		// set variables
		int lastOne = 1;
		int lastTwo = 2;
		int sum = 2;
		
		int counter = 0;
		
		// Generate fibonacci sequence up to 4,000,000
		System.out.printf("%d\n%d\n", lastOne, lastTwo);
		for (counter = 3; counter < 4000000; counter++)
		{

			if (counter == (lastOne + lastTwo)){
				System.out.println(counter);
				// if fibonacci number is even add it to sum
				if (counter % 2 == 0)
				{
					sum += counter;
					//System.out.println(counter);
				}
				// Swap Numbers
				lastOne = lastTwo;
				lastTwo = counter;				
			}
		}
		//  Tell us the result
		System.out.printf("The sum of all EVEN fibonacci numbers under 4 million is %d", sum);
	}

}
