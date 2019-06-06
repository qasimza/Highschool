import java.util.*;
class More3
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String.");
        String s=sc.nextLine();
        s=s+" ";
        int n=0, i, a=0, l=s.length();
        char c;
        String w;
        if(s!=""||s!=" ")
        {
            for(i=0;i<l;i++)
            {
                c=s.charAt(i);
                if (c==' ')
                {
                   w=s.substring(a, i);
                   a=i+1;
                   if(w.length()>=3)
                   {
                       n++;
                    }
                }
                }
            }
        System.out.println("The number of words having 3 or more letters is "+n);
    }
}
