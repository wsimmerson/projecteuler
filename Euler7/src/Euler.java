
public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int primeCount = 0;
		int counter = 1;
		boolean maxPrime = false;
		
		do{
			counter++;
			
			if (checkPrime(counter)){
				System.out.println(counter);
				primeCount++;
			}
			if (primeCount == 10001)
			{
				maxPrime = true;
			}
		} while (!maxPrime);
		
		System.out.printf("%dst prime number found! %d", primeCount, counter);
	}
	
	public static boolean checkPrime(int number)
	{
		long newCount;
		boolean isTrue = true;
		
		for (newCount = 2; newCount < number; newCount++){
			if (number % newCount == 0)
			{
				isTrue = false;
				break;
			}
		}
		return isTrue;
	}

}
