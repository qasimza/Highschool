import java.io.*;
class demo
{
    public static void main (String args []) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter the number of rows");
        int rows= Integer.parseInt (br.readLine ());
        int count = rows-1, k, i, j;
        for (k=1;k<=rows;k++)
        {
            for (i=1; i<=count; i++)
            {
                System.out.print(" ");
            }
            
                count--;
            for (j=1; j<=2*k-1; j++)
            {
                System.out.print ("*");
            }
            System.out.println ();
        }
    }
}
  