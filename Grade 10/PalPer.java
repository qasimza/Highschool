import java.util.*;

class PalPer
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to check if a number is a Palindrome or not.");
        System.out.println("Press 2 to check if a number is a Perfect or not.");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        System.out.println("Enter the number");
        int n=sc.nextInt();
        switch(ch)
        {
            case 1:
            int r=0, t=n;
            while(t!=0 )
            {
               r=r*10+t%10;
               t=t/10;
            }
            if(r==n)
            {
                System.out.println("It is a palindrome");
            }
            else 
            
            {
                System.out.println("It is not a palindrome");
            }
            break;
            case 2:
            int s=0, i;
            for(i=0;i<n;i++)
            {
                if(n%i==0)
                {
                    s=s+i;
                }
            }
            
            if(s==n)
            {
                System.out.println("It is a perfect number");
            }
            else 
            
            {
                System.out.println("It is not a perfect number");
            }
            break;
            default:
            System.out.println("ERROR: Invalid Selection");
        }
    }
}