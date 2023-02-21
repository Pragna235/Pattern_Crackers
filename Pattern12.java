package patternSums;
public class Patterns {

	//pattern12
	public static void pattern12(int n)
	{
		for(int row = 1;row<(2*n);row++)
		{
			if(row<=n)
			{
				for(int sp = 1; sp<row;sp++)
				{
					System.out.print(" ");
				}
				for(int col = 1;col<=(n-row)+1;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for (int sp=1;sp<=(((2*n)-1)-row);sp++)
				{
					System.out.print(" ");
				}
				for(int col = 1;col<=row-4;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}


		}
	}





}


