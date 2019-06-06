import java.util.*;

class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i, s=1, p=1, j;
        double sum=0;
        for(i=2;i<=n;i++)
        {
            s=s+i;
            p=p*i;
            sum=sum+s/p;
        }
        System.out.println("The Sum is: "+sum);
    }
}