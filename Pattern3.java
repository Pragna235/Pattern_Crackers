/*Enter the value of n = 
5
* * * * * 
* * * * 
* * * 
* * 
*

*/

package patternSums;

public class Patterns {
	//pattern3
	public static void pattern3(int n)
	{
		for (int row = 0; row<n; row++)
		{
			for (int col = n-row; col>=1; col-- )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}



}

