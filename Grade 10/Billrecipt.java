import java.util.*;
class Billrecipt
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String name[]=new String[15];
        int t[]= new int[15];
        int i;
        double d=0, a=0;
        
        for (i=0;i<5;i++)
        {
            System.out.println("Enter name of customer");
            name[i]=sc.next();
            
            System.out.println("Enter Ticket charges");
            t[i]=sc.nextInt();
        }
        
        System.out.println("___________________________________________________________________");
        System.out.println("S. No." + '\t' + "Name" + '\t' + "Ticket Charges" + '\t' + "Discount" + '\t' + "Net Amount");
        for (i=0;i<5;i++)
        {
            if (t[i]<25001)
            {
                d=0.02*t[i];
                a=t[i]-d;
            }
            else if(t[i]<=35000 && t[i]>=25001)
            {
                d=0.1*t[i];
                a=t[i]-d;
            }
            else if(t[i]<=55000 && t[i]>=35001)
            {
                d=0.12*t[i];
                a=t[i]-d;
            }
            else if(t[i]<=70000 && t[i]>=55001)
            {
                d=0.16*t[i];
                a=t[i]-d;
            }
            else 
            {
                d=0.18*t[i];
                a=t[i]-d;
            }
            System.out.print(i+1);
            System.out.print('\t' + name[i] + '\t' + "Rs" + t[i] + '\t' + "Rs." + d + '\t' + "Rs." + a);
            a=0; 
            d=0;
            System.out.println();
        }
    }
}
