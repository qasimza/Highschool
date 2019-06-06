import java.util.*;

class ParkingLot
{
    int vno=0;
    int hours=0;
    double bill=0.0;
    
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Vehicle number.");
        vno=sc.nextInt();
        System.out.println("Enter the number of hours.");
        hours=sc.nextInt();
    }
    
    void calculate()
    {
        if (hours<1)
        {
            bill=0;
        }
        else
        {
            bill=3+(hours-1)*1.50;
        }
    }
    
    void display()
    {
        System.out.println("Vehicle Number: "+vno);
        System.out.println("Hours: "+hours);
        System.out.println("Bill: "+bill);
    }
    
    public static void main(String args[])
    {
        ParkingLot x= new ParkingLot();
        x.input();
        x.calculate();
        x.display();
    }
}

        