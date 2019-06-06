import java.util.*;
class Diagonal_DDA
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the size of array");
        int n, r=0, c=0, i, j, x=1;
        n=sc.nextInt();
        sc.close();
        int a[][]= new int[n][n];
        for (i=0; i<2*n-1; i++)
        {
            if (i<n)
            {
                for (j=0; j<=i; j++)
                {
                    System.out.println (r+" "+c+" "+x);a[r][c] =x;
                    x++;
                    r++;
                    c--;
                } 
                r=0; c=i+1;
            }
            else
            {
                r=2*n-2-i; c=n-1;
                for (j=0; j<2*n-1-i; j++)
                {
                    a[r][c]=x;
                    x++;
                    r++;
                    c--;
                }
            }
        }
        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
            {
                System.out.print (a[i][j]+ " ");
            }
            System.out.println ();
        }
    }
}
           
              
        
        