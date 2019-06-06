import java.io.*;
import java.util.Scanner;
class TimeClocks
{
    public static void main (String args [])
    {
        Scanner sc= new Scanner (System.in);
        
        System.out.println ("Enter time in the following format-hh:mm (am or pm)");
            String a= sc.nextLine();
            a = a.replaceAll("\\s","");
            int hour= Integer.valueOf(a.substring(0,2));
            System.out.println ("Enter 1 if you want to convert 12 hour format to 24 hour format and 2 for vice versa");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
            {
            
            if ((hour<=12)&&(hour>=1))
            {
                String c= a.substring(5,7);
                if ((c.equalsIgnoreCase("am")==true))
                {
                    hour= hour-12;
                    System.out.println (hour+":"+(a.substring(3,5)));
                }
                else if ((c.equalsIgnoreCase("pm")==true))
                {
                    hour= hour+12;
                    System.out.println (hour+":"+(a.substring(3,5)));
                }
                else
                {
                   {System.out.println ("Invalid Format");}
                }
            }
            else
            {System.out.println ("Invalid Format");}
            
        }break;
        
        case 2:
         {
            if ((hour<=24)&&(hour>=0))
            {
            if (hour==0)
            {
                hour=hour+12;
                System.out.println (hour+":"+(a.substring(3,5)+" am"));
            }
            else if (hour==24)
            {
                hour=hour-12;
                System.out.println (hour+":"+(a.substring(3,5)+" am"));
            }
            else if ((hour<=12)&&(hour>=1))
            {
               System.out.println (hour+":"+(a.substring(3,5)+" am"));
            }
            else if ((hour<=23)&&(hour>=13))
            {
               hour=hour-12;
                System.out.println (hour+":"+(a.substring(3,5)+" pm"));
            }
            else
                System.out.println ("Invalid Format");
            }
            
            else
            {System.out.println ("Invalid Format");}
        } break;
        default:
        {System.out.println ("Invalid Choice Entered");}
    }
}
}
