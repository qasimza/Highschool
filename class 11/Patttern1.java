import java.util.*;
class Patttern1
{
    public static void main(String args[])
    {
      String s, reverse = "";
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string to check if it is a palindrome");
      s = sc.nextLine();
      int length = s.length();
      for (int e = length - 1; e >= 0; e--)
         reverse = reverse + s.charAt(e);

      if (s.equals(reverse))
      {
         System.out.println("The string is a palindrome.");
         System.out.println(s);
         int i, j, p=1; char c; 
        String r=s;
        int g= length/2;
        int h= length/2+1;
        for(i=g;i>1;i--)
        {
            c=s.charAt(i);
            r=r.replace(c,' ');
            System.out.println(r);
        }
        for(i=1;i<h;i++)
        {
            for(j=i;j<h;j++)
            {
                c=s.charAt(j);
                r=r.replace(c,' ');
            }
            System.out.println(r);
            r=s;
        }
        System.out.println(s);
    }
    
      else
         System.out.println("The string isn't a palindrome.");
    }
}