
public class Euler17 {

	public static void main(String[] args) {
		int x, total = 0;
		double start = System.currentTimeMillis();
		
		for (x = 1; x <= 1000; x++)
		{
			total += convert(x);
		}
		System.out.printf("Total Character count %d\nRuntime: %fms", total,System.currentTimeMillis()-start);
	}
	
	public static int convert(int num)
	{
		int txtCount = 0;
		String units[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String teens[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen" };
		String tens[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty", "ninety" };
		String buffer;
		System.out.printf("Number %d", num);

		if (num == 1000)				{	txtCount += 11; num -= 1000;	} // Thousand
		
		if (num >= 100 && num <= 999)	{	txtCount += 7; // Hundred
											buffer = Integer.toString(num); buffer = buffer.substring(0,1);
											txtCount += units[Integer.parseInt(buffer)].length(); // first number
											buffer = Integer.toString(num); buffer = buffer.substring(1, buffer.length()); // shrink number
											num = Integer.parseInt(buffer);
											if (num != 0)	{	txtCount +=3;	}	}

		
		if (num >= 20 && num <= 99)		{	buffer = Integer.toString(num); buffer = buffer.substring(0,1);
											txtCount += tens[Integer.parseInt(buffer)-2].length(); // tens
											buffer = Integer.toString(num); buffer = buffer.substring(1, buffer.length()); // shrink number
											num = Integer.parseInt(buffer);	}
		
		if (num >=10 && num <= 19)		{	buffer = Integer.toString(num); buffer = buffer.substring(1,buffer.length());
											txtCount += teens[Integer.parseInt(buffer)].length(); // teens
											num = -1;	} // finish convert
		
		if (num >=1 && num <=9)			{	txtCount += units[num].length();	} // units	
				
		System.out.printf(" text count %d\n", txtCount);
		return txtCount;
	}
	
}
