import java.util.*;
class Longest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s=sc.nextLine();
        int i, l, wl, a;
        l=s.length();
        a=s.indexOf(' ')+1;
        String w=s.substring(0,a-1), w2="";
        wl=w.length();
        for(i=a;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                w2=s.substring(a, i);
                if(w.length()<w2.length())
                {
                    wl=w2.length();
                }
                a=i+1;
            }
        }
        w2=s.substring(a,l);
        if(w.length()<w2.length())
        {
            wl=w2.length();
        }
        System.out.println("The length of longest word is "+ wl);      
    }
}