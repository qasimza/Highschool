import java.util.*;
class Convert
{
    static char hexalpha(int n) //To calculate alphabetic hexadecimal value
    {
        char c=' ';
        switch(n)
        {
            case 10:
            c='A';
            break;
            case 11:
            c='B';
            break;
            case 12:
            c='C';
            break;
            case 13:
            c='D';
            break;
            case 14:
            c='E';
            break;
            case 15:
            c='F';
            break;
        }
        return c; 
    }
    public static void main (String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in base 10");
        int n=sc.nextInt();
        int r;
        String h="";
        while(n>0)
        {
            r=n%16;
            if(r>9)
            {
                h=hexalpha(r)+h;
            }
            else
            {
                h=r+h;
            }
            n=n/16;
        }
        System.out.println("The decimal number in hexadecimal is "+h);
    }
}

