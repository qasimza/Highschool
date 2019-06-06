import java.util.*;
class Pattern2
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer"); //Accepting a number from the user
        int n=sc.nextInt();
        int mat[][]=new int[2*n-1][2*n-1];
        int i, j, k, r1=0, r2=2*n-1; //Decaring and initialsing variables
        for (i=n;i>0;i--) //Generating and storing pattern in mat[][]
        {
            for (j=r1;j<r2;j++)
            {
                for (k=r1;k<r2;k++)
                {
                    mat[j][k]=i;
                    mat[k][j]=i;
                }
            }
            r1++;
            r2--;
        }
        for (i=0;i<2*n-1;i++) //Displaying pattern
        {
            for (j=0;j<2*n-1;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}