import java.util.*;

class Salary
{
    String Name, Address, SubjectSpecialization;
    int MonthlySalary, Phone;
    double IncomeTax;
    void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your details");
        System.out.println("Name:");
        Name=sc.nextLine();
        System.out.println("Address:");
        Address=sc.nextLine();
        System.out.println("Phone:");
        Phone=sc.nextInt();
        System.out.println("Subject Specialization:");
        SubjectSpecialization=sc.next();
        System.out.println("Monthly Salary:");
        MonthlySalary=sc.nextInt();
        sc.close();
    }
    void compute()
    {
        if (MonthlySalary>175000)
        {
            IncomeTax=0.05*(MonthlySalary-175000);
        }
        else
        {
            IncomeTax=0;
        }
    }
    void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Address: "+Address);
        System.out.println("Phone: "+Phone );
        System.out.println("Subject Specialization: "+SubjectSpecialization);
        System.out.println("Monthly Salary: Rs."+MonthlySalary);
        System.out.println("Income Tax: Rs."+IncomeTax);
    }
    public static void main()
    {
        Salary ob=new Salary();
        ob.input();
        ob.compute();
        ob.display();
    }
}