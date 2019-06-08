/*
Progarm to generate a Bell Triangle

Definintion: 
Bell Triangle (aka Aitken's array / Peirce triangle).
Number triangle obtained by beginning the first row with the number one, 
and beginning subsequent rows with last number of the previous row. 
Rows are filled out by adding the number in the preceding column to the number above it
*/


import java.util.*;
class BellTriangle
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n, x=1, i=1, j; //Declaring and Initialising required variables
        System.out.println("Enter the number of rows");
        n=sc.nextInt();
        int a[][]= new int[n][n];
        for(i=0;i<n;i++) //To generate the required terms
        {
            for (j=0;j<=i;j++)
            {
                a[i][j]=x;
                if(j==i)
                {
                   break;
                }
                x=a[i-1][j]+a[i][j];
            }
        }
        for(i=0;i<n;i++) //To print the required triangle
        {
            for (j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

