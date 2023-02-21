package patternSums;

public class Patterns {
	//pattern4
	public static void pattern4(int n)
	{
		for(int row = 1;row<=n;row++)
		{
			for(int col = 1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}




}

