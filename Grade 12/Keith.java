import java.util.*;
class Keith
{
    public static void main(String args[])
        {
         Scanner sc= new Scanner(System.in);
         System.out.print("Enter the number : "); //Accepting the number
         int n=sc.nextInt();
         int copy=n;
         String s=Integer.toString(n);
        int d=s.length(); //Finding the number of digits (d) in the number
        int arr[]=new int[n]; //Array for storing the terms of the series
        for(int i=d-1;i>=0;i--) //Storing the digits of the number in the array
        {
            arr[i]=copy%10; 
            copy=copy/10;
        }
        int i=d,sum=0;
        while(sum<n) //Finding the sum till it is less than the number
        {
            sum = 0;
            for(int j=1; j<=d; j++) //Loop for generating and adding the previous 'd' terms
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum; //Storing the sum in the array
            i++;
        }
        if(sum==n) //If sum is equal to the number, then it is a Keith number
            {
                System.out.println("The number is a Keith Number");
            }
            else
            {
                System.out.println("The number is a not a Keith Number");
            }
    }
}