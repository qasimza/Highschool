import java.util.*;
class Kfreq
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a string"); //Accepting a String from the user
        String s=sc.next();
        s=s.toLowerCase(); //Converting the String to Lower Case
        System.out.println ("Enter a character"); //Accepting the character to be searched
        char c=(char)((sc.next()).charAt(0));
        System.out.println ("Enter the number of ouccurances in each substring"); //Accepting the value of k from the user
        int k=sc.nextInt();
        int i, j, l, a, d, n=0, o=0;
        l=s.length(); //Calculating length of the String
        d=k;
        String sub;
        for (i=k;i<l+1;i++)
        {
            for (j=0;j<l-d+1;j++)
            {
                sub=s.substring(j, j+d); //Extracting substrings
                for (a=0;a<sub.length();a++)
                {
                    if (sub.charAt(a)==c) //Calculating frequency of c in sub
                    {
                        o++;
                    }
                }
                if (o==k)
                {
                    n++;
                }
                o=0;
            }
            d++;
        }
        System.out.println("The number of substrings is "+n); //Displaying number of substrings with exactly k occurances of c
    }
}