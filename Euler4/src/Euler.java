
public class Euler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Set Variables
		int count1 = 999;
		int count2 = 999;
		String newString = "";
		
		int palendrom = 0;
		
		// Start looping backwards
		for (count1=999; count1 > 100; count1--)
		{
			for (count2=999; count2 > 100; count2--)
			{
				newString = Integer.toString(count1 * count2);
				
				if (isPalendrome(newString))
				{
					if (Integer.parseInt(newString) > palendrom)
					{
						palendrom = Integer.parseInt(newString);
					}
					
				}
			}
		}
		System.out.printf("The highest possible palendrom is %d", palendrom);

	}
	
	public static boolean isPalendrome(String checkPal)
	{
		boolean isTrue = false;
		StringBuffer forward = new StringBuffer(checkPal);
		StringBuffer backwards = new StringBuffer(checkPal);
				
		String num1 = forward.toString();
		String num2 = backwards.reverse().toString();		
			
		if (num1.equals(num2))
		{
			isTrue = true;
		}
		else
			isTrue = false;
						
		return isTrue;
	}

}
