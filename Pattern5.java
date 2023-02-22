/*Enter the value of n = 
5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/

package patternSums;

public class Patterns {
	//pattern5
	public static void pattern5(int n)
	{
		for(int row = 1;row<(2*n);row++)
		{
			if(row<=n)
			{
				for(int col = 1;col<=row;col++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{
				for(int col = n-(row-n);col>=1;col--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}

		}
	}



}

