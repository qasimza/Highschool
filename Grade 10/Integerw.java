import java.util.*;
 class Integerw
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        String s=sc.nextLine();
        int l=(s.trim()).length();
        int i;
        char c;
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            switch (c)
            {
                case '0':
                System.out.print("Zero");
                break;
                case '1':
                System.out.print("One ");
                break;
                case '2':
                System.out.print("Two ");
                break;
                case '3':
                System.out.print("Three ");
                break;
                case '4':
                System.out.print("Four ");
                break;
                case '5':
                System.out.print("Five ");
                break;
                case '6':
                System.out.print("Six ");
                break;
                case '7':
                System.out.print("Seven ");
                break;
                case '8':
                System.out.print("Eight ");
                break;
                case '9':
                System.out.print("Nine ");
                break;
                default:
                System.out.println("ERROR: WRONG INPUT");
            }
        }
    }
}
        
