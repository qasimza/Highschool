import java.util.*;
class Converter
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        double t, ft;
        int ch;
        System.out.println("To convert from Farenheit to Celsius, Press 1");
        System.out.println("To convert from Celsius to Farenheit, Press 2");
        System.out.println("Enter your Choice");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter temperature in Farenheit");
            t=sc.nextDouble();
            ft=(5*(t-32))/9;
            System.out.println("Temperature in Celsius is"+ft);
            break;
            
            case 2:
            System.out.println("Enter temperature in Celsius");
            t=sc.nextDouble();
            ft=1.8*t+32;
            System.out.println("Temperature in Farenheit is"+ft);
            break;
            
            default:
            System.out.println("ERROR: WRONG CHOICE");
        }
    }
}