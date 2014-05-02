
public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.printf("The difference between the sum of the squares and the sqare of the sums is %d", 
				squareOfSums() - sumOfSquares());
	}
	
	public static int sumOfSquares()
	{
		int result = 0;
		int x;
		for (x = 0; x <=100; x++)
		{
			result += (x * x);
		}
		return result;
	}
	
	public static int squareOfSums()
	{
		int result = 0;
		int x;
		for (x =0; x <= 100; x++)
		{
			result += x;
		}
		result = (result * result);
		
		return result;
		
	}

}
