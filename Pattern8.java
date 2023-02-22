/*
Enter the value of n = 
5
    *
   ***
  *****
 *******
*********
*/


package patternSums;
public class Patterns {
	//pattern8
	public static void pattern8(int n)
	{
		for(int row = 1;row<=n;row++)
		{
			for(int sp = (n-row);sp>=1;sp--)
			{
				System.out.print(" ");
			}
			for(int col = 1;col<(2*row);col++)
			{

				System.out.print("*");
			}
			System.out.println();
		}
	}



}


