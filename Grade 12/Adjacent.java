//Program to recursively remove adjacent duplicates in a string
import java.util.*;
class Adjacent
{
    public String removeDuplicates(String s) 
    {
        int i, flag=0; //Declaring and intialising variables
        String str="";
        if(s.length()==0||s.length()==1) 
        {
            flag=1; 
        }
        else
        {
            flag=1;
            for (i=0;i<s.length()-1;i++) //Checking for adjacent duplicates
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    flag=0;
                }
            }
        }
        if (flag==1)
        {
            return s; //returning string with no adjacent duplicates
        }
        else
        {
            for (i=0;i<s.length()-1;i++) //Removing adjacent duplicates
            {
                if(s.charAt(i)==s.charAt(i+1))
                {
                    while(s.charAt(i)==s.charAt(i+1)&&i<s.length()-2)
                    {
                        i++;
                    }
                }
                else
                {
                    str=str+s.charAt(i);
                }
            }
            if(s.charAt(s.length()-2)!=s.charAt(s.length()-1)) //Adding last character if it is not an adjacent duplate
            {
                str=str+(s.charAt(s.length()-1));
            }
            return removeDuplicates(str);
        }
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a string"); //Accepting a String from the user
        String s=sc.next();
        Adjacent obj=new Adjacent(); 
        String a=obj.removeDuplicates(s); //Removing adjacent duplicates
        System.out.println(a); 
    }
}
