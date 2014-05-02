import java.math.*;

public class Euler16 {
	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		String power = String.valueOf((BigInteger.valueOf(2).pow(1000)));
		long sum = 0;
		int cnt = 0;
		
		for (cnt = 0; cnt < power.length(); cnt++)
		{
			sum += Integer.parseInt(power.substring(cnt,cnt+1));	
		}
		
		System.out.printf("The sum is %d\n Total runtime: %fms", sum, System.currentTimeMillis() - start);
	}
}
