import java.util.*;
class Armstrong
{
    static int n;
    static int s=0;
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        sc.close();
        n=num;
        System.out.println(check (num));
    }
    public static boolean check(int x)
    {
        if (x==0)
        {
            System.out.println ("s="+s+" n="+n);
            if (n==s)
                return true; 
            else 
                return false;
        }
        else
        {
            int d=x%10;
            System.out.println(d);
            s=s+d*d*d;
            System.out.println(s);
            x=x/10;
            System.out.println(x);
            return check(x);
        }
    }
}