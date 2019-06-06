import java.util.*;

class Menu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to print series 0, 3, 8, 15, 24...");
        System.out.println("Press 2 to print sum of series, s=1/2+ 3/4 + 5/6 +7/8.....19/20");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        int i, n;
        switch (ch)
        {
            case 1:
            System.out.println("Enter number of terms");
            n=sc.nextInt();
            System.out.println("The series is "); 
            for(i=1;i<=n;i++)
            {
                System.out.print(i*i-1+", ");
            }
            break;
            case 2:
            n=0;
            for(i=1;i<20;i=i+2)
            {
                n=n+(i/(i+1));
            }
            System.out.println("The sum of the series is "+ n);
            break;
            default:
            System.out.println("ERROR: WRONG CHOICE");
        }
    }
}
   