import java.util.*;
class DeciOct
{
    int n, oct;
    DeciOct()
    {
        n=0;
        oct=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    void deci_oct()
    {
        int x=n;
        if(n>8)
        {
            n=n/8;
            deci_oct();
        }
        oct=oct*10+x%8;
    }
    void display()
    {
        System.out.println("Decimal Value="+n);
        deci_oct();
        System.out.println("Octal Value="+oct);
    }
     public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an Integer");
        int a=sc.nextInt();
        DeciOct obj=new DeciOct();
        obj.getnum(a);
        obj.display();
    }
}

