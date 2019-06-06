import java.util.*;
class Words 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String.");
        String s=sc.nextLine();
        int n=0, i;
        char c;
        if(s!=""||s!=" ")
        {
            for(i=0;i<s.length()-1;i++)
            {
                c=s.charAt(i);
                if (c==' ')
                {
                    if(Character.isLetter(s.charAt(i+1))==true)
                    {
                        n++;
                    }
                }
            }
            if (n!=0)
            {
                n++;
            }
        }
        System.out.println("The number of words is "+n);
    }
}
