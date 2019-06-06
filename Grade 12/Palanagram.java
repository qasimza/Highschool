import java.util.*;
class Palanagram
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a string"); //Accepting a String from the user
        String s=sc.nextLine();
        s=s.toLowerCase(); //Converting the String to Lower Case
        char c; 
        int freq[]=new int[s.length()];
        int i, j, f=0, flag=1;
        for (i=0;i<s.length();i++) //Finding frequency of each character in s
        {
            for (j=0;j<s.length();j++)
            {
                if (s.charAt(i)==s.charAt(j))
                {
                    f++;
                }
           }
           freq[i]=f;
           f=0;
        }
        for (i=0;i<s.length();i++) //Checking if a palindrome can be formed from characters of s
        {
            if (freq[i]%2!=0)
            {
                for (j=i+1;j<s.length();j++)
                {
                    if (freq[j]%2!=0&&s.charAt(i)!=s.charAt(j))
                    {
                        flag=0;
                    }
                }              
            }
        }
        if (flag==1) 
        {
            System.out.println ("A palindrome can be formed from the characters of "+s); 
        }
        else
        {
            System.out.println ("A palindrome cannot be formed from the characters of "+s); 
        }
    }
}
