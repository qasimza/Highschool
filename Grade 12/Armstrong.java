//Program to recursively check if a number is Armstrong.An armstrong number is an integer such that the sum of the cubes of its digits is equal to the number itself.

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
        System.out.println(check(num)?"Armstrong Number":"Not an Armstrong Number");
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
            s=s+d*d*d;
            x=x/10;
            return check(x);
        }
    }
}
