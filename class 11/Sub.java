import java.util.*;
class Sub
{
    public static void main (String args[])
    {
        String s="Hello Big World.";
        System.out.println(s.substring(5,11));
        int i, a=0;
        String w;
        Scanner sc=new Scanner (s);
       while(sc.hasNext())
       {
           w=sc.next();
           System.out.println(w);
        }
    }
}