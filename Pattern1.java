/*Enter the value of n = 
5
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * */


package patternSums;

public class Patterns {
	//pattern1
	public static void pattern1(int n)
	{
		for(int row = 1;row<=n;row++)
		{
			for(int col = 1;col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}



}

