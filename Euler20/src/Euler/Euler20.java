package Euler;

import java.math.BigInteger;

public class Euler20 {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		String num = "100";
		int x;
		BigInteger product = new BigInteger(num);
		BigInteger sum = new BigInteger("0");

		// Get Product
		for (x = Integer.parseInt(num); x >= 2; x--){
			product = product.multiply(new BigInteger(Integer.toString(x - 1)));
		}
		
		// Get Sum of digits in Product
		num = product.toString();
		do {
			sum = sum.add(new BigInteger(num.substring(0,1)));
			num = num.substring(1, num.length());
		} while (num.length() > 0);
		
		System.out.printf("sum of digits in 100! is %d\nRuntime: %f ",
				sum,
				System.currentTimeMillis() - start);
	}
		
}
	
	

