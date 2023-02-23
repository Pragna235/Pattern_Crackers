/*Enter number of rows: 5
    1
   212
  32123
 4321234
543212345
*/


#include<stdio.h>

int main()
{
    int n;

    printf("Enter number of rows: ");
    scanf("%d",&n);

    for(int row =1;row<=n;row++)
    {
        for(int sp=1;sp<=n-row;sp++)
        {
            printf(" ");
        }

        for(int col1=row;col1>=1;col1--)
        {
            printf("%d", col1);
        }

        for(int col2=2;col2<=row;col2++)
        {
            printf("%d", col2);
        }
        printf("\n");
    }

    return 0;
}
