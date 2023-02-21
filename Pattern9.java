package patternSums;
public class Patterns {
	//pattern9
	public static void pattern9(int n)
	{
		for(int row = n;row>=1;row--)
		{
			for(int sp = 0;sp<(n-row);sp++)
			{
				System.out.print(" ");
			}
			for(int col = 1;col<=(2*row)-1;col++)
			{

				System.out.print("*");
			}
			System.out.println();
		}
	}



}


