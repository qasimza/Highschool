import java.util.*;
class Patterne
{   
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string"); //Accept a string from the user
        String s=sc.nextLine();
        int l=s.length(); //Calculating length of string input
        int a, i, j, k , q=l-1, m=l;
        System.out.println();
        for(a=0;a<l;a++) // Generating first half of pattern
        {
            for(i=0;i<=q;i++)
                System.out.print(" ");
            q--;                               
            for(i=0;i<a;i++)          
                System.out.print(s.charAt(i));
            System.out.print("_");
            for(j=m;j<=l-1;j++)    
                System.out.print(s.charAt(j));
            m--;                           
            System.out.println();  
        }
         q=0;k=l-2;m=1;
        for(a=1;a<=l;a++) // Generating second half of pattern
        { 
            for(i=0;i<=q;i++)
                System.out.print(" ");
            q++;                            
            for(i=0;i<=k;i++)         
                System.out.print(s.charAt(i));
            k--;                            
            System.out.print("_");
            for(j=m;j<=l-1;j++)    
                System.out.print(s.charAt(j));
            m++;               
            System.out.println();
        } }}
