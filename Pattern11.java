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

	//pattern11
	public static void pattern11(int n)
	{
		for(int row = 0;row<n;row++)
		{
			for(int sp = 0; sp<row;sp++)
			{
				System.out.print(" ");
			}
			for(int col = 1;col<=(n-row);col++)
			{
				System.out.print("* ");
			}
			System.out.println();

		}
	}



}


