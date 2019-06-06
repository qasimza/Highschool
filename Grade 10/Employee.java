import java.util.*;
class Employee
{
   static int pan;
   static String name;
   static double taxincome;
   static double tax;
    static void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Personal Account Number");
        pan=sc.nextInt();
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your Income");
        taxincome=sc.nextDouble();
        sc.close();       
    }
    static void tax()
    {
        if(taxincome<=100000)
        {
            tax=0;
        }
        else if (taxincome<150000&&taxincome>=100001)
        {
            tax=0.1*(taxincome-100000);
        }
        else if (taxincome<250000&&taxincome>=150001)
        {
            tax=5000+0.2*(taxincome-150000);
        }
        else
        {
            tax=25000+0.3*(taxincome-250000);
        }
    }
    static void display()
    {
        System.out.println("PAN: "+pan);
        System.out.println("Name: "+name);
        System.out.println("Income: "+taxincome);
        System.out.println("Tax: "+tax);
    }
    public static void main (String args[])
    {
        input();
        tax();
        display();
    }
    
}