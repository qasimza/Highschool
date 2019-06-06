import java.util.*;

class HappyNumber
{
    public static void main (String args []) 
    {
        System.out.println ("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a, n, sum=0, d;//Declaring and initlaizing variables
        n= sc.nextInt();
        while (n>9) //Calculating effectim sum of squares of digits
        {
            sum=0;
            a=n;
            while (a!=0)
            {
                d=a%10; //Extracting digits
                sum=sum+d*d;
                a=a/10;
            }
            n=sum;
        }
        if (sum==1) //Checking if the sum of sqares of digits is 1
        {
             System.out.println ("It is a happy number");
        }
        else
        {
            System.out.println ("It is not a happy number");
        }
    }
}
