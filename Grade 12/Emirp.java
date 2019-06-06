import java.util.*;
class Emirp
{
    int n, rev, f;
    Emirp()
    {
        a=0;
        b=1;
        c=1;
    }
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the limit of the series");
        limit=sc.nextInt();
    }
    int fib(int n)
    {
        if (n==1)
        return 0;
        else if(n==2)
        return 1;
        else 
        return (fib(n-1)+fib(n-2));
    }
    void generate_fibseries()
    {
        int i;
        for (i=1; i<=limit; i++)
        {
            System.out.println(fib(i));
        }
    }
     public static void main (String args[])
    {
        Emirp obj=new Emirp();
        obj.input();
        obj.generate_fibseries();
    }
}

