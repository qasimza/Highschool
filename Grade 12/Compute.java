import java.util.*;
class Compute extends Library
{
    int d;
    float total;
    Compute(String n, String a, float amt, int days)
    {
        super (n,a,amt); //Using the constructor of baseclass
        d=days;
        total=(float)((.02*p)*d); //Calculating amout due without fine
    }
    double fine() //Function for calculating the fine
    {
        float f=0;
        if(d>7)
        {
            d=d-7;
            if(d<=5)
            {
                f=2*d;
            }
            else if(d<=10)
            {
                f=10+((d-5)*3);
            }
            else
            {
                f=10+15+((d-10)*5);
            }
            d=d+7;
        }
        total=total+f;
        return f;
    }
    void display()
    {
        show();
        System.out.println ("Book taken for  "+d+" days");
        System.out.println ("Total Fine: Rs."+fine());
        System.out.println ("Total amount to be paid: Rs. "+total);
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter the name of the book"); //Accepting the name of the book from the user
        String n=sc.nextLine();
        System.out.println ("Enter author's name"); //Accepting the author's name
        String a=sc.nextLine();
        System.out.println ("Enter price of the book"); //Accepting the price of the book
        float amt=sc.nextFloat();
        System.out.println ("Enter the number of days"); //Accepting the number of days
        int d=sc.nextInt();
        Compute ob=new Compute(n, a, amt, d);
        ob.display();
    }
}
