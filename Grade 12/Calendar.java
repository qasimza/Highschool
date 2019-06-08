//Program to output the day week for a given date. Program assumes valid date input.

import java.util.*;

class Calendar
{
    int year, month, day;
    void input() //Function for accepting the date from the user
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the day: ");
        day=sc.nextInt();
        System.out.print("Enter the month: ");
        month=sc.nextInt();
        System.out.print("Enter the year: ");
        year=sc.nextInt();      
    }
    public int yearCode() //Function for generating Year Code
    {
        int y=year%100;
        return (y+(y/4))%7;
    }
    public int monthCode() //Function for generating Month Code
    {
        int a[]={0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        return a[month-1];
    }
    public int centuryCode() //Function for generating Century Code
    {
        int cent=(year/100)%4;
        int a[]={6, 4, 2, 0};
        return a[cent];
    }
    public int leapyearCode() //Function for generating Leap Year Code
    {
        if (year%400==0||(year%4==0&&year%100!=0))
            return 1;
        else 
            return 0;
    }
    public void generate() //Function for generating calender
    {
        System.out.println("Calendar for "+month+"/"+year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat\t");
        int b[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i; 
        int l=(yearCode()+monthCode()+centuryCode()+1-leapyearCode())%7; //Calculating day of week on 1st of month input
        if (leapyearCode()==1) //If it is a leap year, February will have 29 days
        b[1]=29;
        for(i=0;i<l;i++) 
        {
            System.out.print("\t");
        }
        for(i=1+l;i<=b[month-1]+l;i++) //Printing days of calendar
        {
            System.out.print(i-l+"\t");
            if ((i%7==0))
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        Calendar ob=new Calendar();
        ob.input(); //Accepting date from the user
        int w=(ob.yearCode()+ob.monthCode()+ob.centuryCode()+ob.day-ob.leapyearCode())%7; //Generating weekday number
        String weekday[]={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}; 
        System.out.println("It was/will be a "+weekday[w]+" on "+ob.day+"/"+ob.month+"/"+ob.year); //Displaying day of week on date input
        ob.generate(); //Displaying calender for given month and year
    }
}
