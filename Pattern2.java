package patternSums;

public class Patterns {
	//pattern2
	public static void pattern2(int n)
	{
		for(int row = 1;row<=n;row++)
		{
			for(int col = 1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}



}

