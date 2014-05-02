
public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0; // initialize x
		int total = 0; // initialize total
		
		for (x=1; x<1000; x++)
		{
			if (x % 3 == 0 || x % 5 == 0)
			{
				total += x;
			}
		}
		
		System.out.printf("Sum of all multiples %d", total);

	}

}
