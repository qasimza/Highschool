import java.util.*;

class Special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int s=0, f=1, d, i, n=a;
        while(a!=0)
        {
            d=a%10;
            for(i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
            f=1;
            a=a/10;
        }
        if (n==s)
        {
            System.out.println("It is a Special Number");
        }
        else
        {
            System.out.println("It is not a Special Number");
        }
    }
   }
