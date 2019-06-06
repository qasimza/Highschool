import java.util.*;
class Removepal
{
    public static boolean checkPal(String a)
    {
      String rev="";
      int i;
      for(i=0;i<a.length();i++)
      {
         rev=a.charAt(i)+rev; 
      }
      if (a.equalsIgnoreCase(rev))
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String.");
        String s=sc.nextLine(), w, str="";
        sc.close();
        Scanner z=new Scanner (s);
         while(z.hasNext())
        {
                w=z.next();
                System.out.println(w);
                if(Removepal.checkPal(w)==false)
                {
                    str=str+w+" ";
                }
        }
        System .out.println("The new string is: "+ str);
    }
}