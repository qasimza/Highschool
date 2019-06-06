import java.util.*;
class Reversecase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        sc.close();
        int l=s.length(), i;
        char c;
        for(i=0; i<l; i++)
        {
            c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                System.out.print(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c))
            {
                System.out.print(Character.toUpperCase(c));
            }
            else
            {
                System.out.print(c);
            }
        }
    }
}
