
public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int MAXCOUNT = 2000000;
		long sumPrime = 2;
		int x;
		
		for (x = 2; x < MAXCOUNT; x++) {	if(checkPrime(x)) { sumPrime += x;}		}
		System.out.printf("Sum of Primes under 2 million is %d", sumPrime);

	}
	
	public static boolean checkPrime(int check)
	{
		boolean isPrime = false;
		int x;
		
		for (x = 2; x < check; x++) { 	if (check % x == 0) { isPrime = false; break;	}
										else { isPrime = true; }	}		
		return isPrime;
	}

}
