import java.util.*;
class Largest
{
    public static void main (String args []) 
    {
        Scanner sc=new Scanner(System.in);
        int a, n, i, j, max=0, x=0, temp; //Declaring and initalizing required variables
        System.out.println ("Enter the number of integers");
        a= sc.nextInt();
        System.out.println ("Enter the integers");
        int num[]=new int[a];
        for (i=0;i<a;i++)//Accepting elements of array
        {
            num [i]= sc.nextInt();
            if(i==0)
            {
                max=num[i];
                x=num[i];
            }
            max=num[i]>max?num[i]:max; //Calcualting largest integer
            x=num[i]<x?num[i]:x; //Calculating smallest integer
        }
        System.out.println ("Which largest integer do you want?");
        n= sc.nextInt();
        for (i=0;i<n-1;i++) //Calculating nth largest integer 
        {
            temp=x;
            for (j=0;j<a;j++)
            {
                if(num[j]<max&&num[j]>temp)
                {
                    temp=num[j];
                }
            }
            max=temp;
        }
        System.out.println ("The "+n+"th largest integer is "+ max);
    }
}
