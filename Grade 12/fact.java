import java.util.*;
class fact
{
    public static int factorial(int n)
    {
        if (n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static int gcd(int a, int b)
    {
        if (b==0)
        return a;
        else
        return gcd(b, a%b);
    }
    public static int fib(int n)
    {
        if (n<=1)
        return n;
        else 
        return fib (n-1)+fib(n-2);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the number");
        int num=sc.nextInt();
        System.out.println(factorial(num));
        System.out.println(gcd(num, 20));
        System.out.println(fib(num));
    }
}