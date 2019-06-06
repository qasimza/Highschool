import java.io.*;
class num
{
    public static void main (String args []) throws IOException
    {
        BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter a string");
        String rows= br.readLine ();
        System.out.println (rows.length());
        }
    }
