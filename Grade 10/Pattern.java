import java.util.*;

class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 to print Triangle");
        System.out.println("Press 2 to print Inverted Triange");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        int i, j, n;
        System.out.println("Enter the number of terms");
        n=sc.nextInt();
        switch (ch)
        {
            case 1:
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            case 2:
            for(i=n;i>=1;i--)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            break;
            default:
            System.out.println("ERROR: WRONG CHOICE");
        }
    }
}
