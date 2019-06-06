import java.util.*;
class Path
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        String name[]=new String[15];
        int t[]= new int[15];
        int i;
        double d=0, a=0;
        for (i=0;i<15;i++)
        {
            System.out.println("Enter name of customer");
            name[i]=sc.nextLine();
            
            System.out.println("Enter Ticket charges");
            t[i]=sc.nextInt();
        }
    }
}