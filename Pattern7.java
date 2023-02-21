package patternSums;

public class Patterns {

	//pattern7
	public static void pattern7(int n)
	{
		for(int row = 0;row<n;row++)
		{
			for(int sp = 1;sp<=row;sp++)
			{
				System.out.print(" ");
			}
			for(int col = (n-row);col>=1;col--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}



}

