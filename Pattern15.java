//pattern15
		public static void pattern15(int n)
		{
			//first half
			for (int row=1; row<= n ; row++)
			{
			for (int sp = row; sp < n ; sp++)
			{
			System.out.print(" ");
			}
			for (int col = 1; col <= (2*row -1) ;col++)
			{
			if(col==1 ||  col==(2*row-1))
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
			}
			System.out.println();
			}

			//second half
			for (int row=n-1; row>=1 ; row--)
			{
			for (int sp = row; sp < n ; sp++)
			{
			System.out.print(" ");
			}
			for (int col = 1; col <= (2*row -1) ;col++)
			{
			if(col==1 || col==(2*row-1))
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
			}
			System.out.println();
			}
		}
