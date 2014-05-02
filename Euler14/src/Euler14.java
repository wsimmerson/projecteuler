
public class Euler14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prjStrt = System.currentTimeMillis();		
		int STARTCOUNT = 1000000;
		long counter = 0, chain = 0, longChain = 0, bigNum = 0;
		for (counter = STARTCOUNT; counter >= 1; counter--)
		{
			chain = getChain(counter);
			if (chain > longChain)	{	longChain = chain; bigNum = counter;	}
		}
		System.out.printf("The Number which generated the longest chain was %d with a total of %d chains", bigNum, longChain);		
		
		System.out.printf("\nRun Time %fms\n", System.currentTimeMillis() - prjStrt);
	}
	
	public static long getChain(long chain){
		long counter = 1;		
		do {
			if 		(chain % 2 == 0)	{	chain = chain / 2; 		counter++; }
			else if (chain % 2 != 0)	{	chain = (3 * chain) +1;	counter++; }	
		}while (chain > 1);
		
		return counter;
	}

}
