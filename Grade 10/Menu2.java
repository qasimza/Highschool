import java.util.*;

class Menu2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Press 1 to check if a number is a BUZZ number");
        System.out.println("Press 2 to find the GCD of 2 numbers");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        int n;
        switch (ch)
        {
            case 1:
            System.out.println("Enter a number");
            n=sc.nextInt();
            if(n%10==7||n%7==0)
            {
                System.out.println("Buzz Number!");
            }
            else
            {
                  System.out.println("Not Buzz Number!");
            }
            break;
            case 2:
            System.out.println("Enter two numbers");
            n=sc.nextInt();
            int m=sc.nextInt();
            int r;
            if (n<m)
            {
                r=n;
                n=m;
                m=r;
            }
            while(n%m!=0)
            {
                r=n;
                n=m;
                m=r%n;
            }
            System.out.println("The GCD is "+m);
            break;
            
            default:
            System.out.println("ERROR: WRONG CHOICE");
        }
    }
}
