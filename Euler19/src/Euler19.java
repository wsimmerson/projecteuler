
public class Euler19 {

	public static void main(String[] args) {
		double start = System.currentTimeMillis();
		int year, day, numDays, weekDay = 1, month, sunday = 0;
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean leap = false;
		
		for (year = 1901; year <= 2000; year++)	
		{
			if (year % 4 == 0)								{	leap = true;	}
			else											{	leap = false;	}
			
			for(month = 0; month <= 11; month++)	
			{
				numDays = months[month];
				if (leap && month == 1)						{	numDays++;		}
				for (day = 1; day <= numDays; day ++)	
				{
					if (weekDay == 8)						{	weekDay = 1;	}
					if (day == 1 && weekDay == 1)			{	sunday++;		}
					weekDay++;
				}
			}
		}
		System.out.printf("Number of Sundays on the first of the month %d\n", sunday);
		System.out.println(System.currentTimeMillis() - start +"ms");
	}

}
