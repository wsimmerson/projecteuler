

public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long counter = 0;
		long number = 600851475143l;
		
		for (counter = 2; counter <= number; counter++)
		{
			if ( number % counter == 0 )
			{
				if (checkPrime(counter))
				{
					System.out.println(counter);
				}
			}
		}
	}

	public static boolean checkPrime(long arg)
	{
		long newCount;
		boolean isTrue = true;
		
		for (newCount = 2; newCount < arg; newCount++){
			if (arg % newCount == 0)
			{
				isTrue = false;
				break;
			}
		}
		return isTrue;
	}
}

