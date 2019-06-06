import java.util.*;
class NetAmt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer's Name");
        String name=sc.nextLine();
        System.out.println("Enter Customer's Address");
        String address=sc.nextLine();
        System.out.println("Enter Amount");
        int amount=sc.nextInt();
        System.out.println("Enter Type of Purchase (L or D for Laptop or Desktop respectively)");
        String a=sc.next();
        char type=a.charAt(0);
        double net_amt=0;
        switch (type)
        {
            case 'L':
            if (amount<=25000)
            {
                net_amt=amount;
            }
            else if(amount<=57000&&amount>=25001)
            {
                net_amt=amount*0.95;
            }
            
            else if(amount<=100000&&amount>=57001)
            {
                net_amt=amount*0.925;
            }
            else
            {
                net_amt=amount*0.9;
            }
            System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("Net Amount: "+net_amt);
            break;
        
        
            case 'D':
            if (amount<=25000)
            {
                net_amt=amount*0.95;
            }
            else if(amount<=57000&&amount>=25001)
            {
                net_amt=amount*0.925;
            }
        
            else if(amount<=100000&&amount>=57001)
            {
                net_amt=amount*0.9;
            }
            else
            {
                net_amt=amount*0.85;
            }
            System.out.println("Name: "+name);
            System.out.println("Address: "+address);
            System.out.println("Net Amount: "+net_amt);
            break;
        
            default:
            System.out.println("ERROR : WRONG CHOICE");
        }
    }
}
        