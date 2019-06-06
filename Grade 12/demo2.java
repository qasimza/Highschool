import java.io.*;
class demo2
{
    public static void main (String args []) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter the number of rows");
        int rows= Integer.parseInt (br.readLine ());
        int count=1, k, i,  j;
        for (k=rows;k>=1;k--)
        {
            for (j=1; j<=k; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            for (i=1; i<=count; i++)
            {
                System.out.print (" ");
            }
            count=count+1;
        }
    }
}