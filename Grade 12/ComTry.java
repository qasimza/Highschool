//This program generates all possible letter combinations possible for a 3-digit phone key-pad input
// Key-pad reference: https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjXpM6zytriAhVqn-AKHbBnB3sQjRx6BAgBEAU&url=https%3A%2F%2Fwww.researchgate.net%2Ffigure%2FThe-standard-12-key-telephone-keypad-character-layout-follows-the-ITU-E161-standard-8_fig1_221518150&psig=AOvVaw0xIB6Fp1BqmttIDRqsv5tA&ust=1560107112495961

import java.util.*;

class ComTry
{
    static String arr [][]={{""}, {""}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o",}, {"p", "q", "r", "s"}, {"t","u","v"}, {"w", "x", "y", "z"}};
    static int n;
    static String s="";
    public static void main (String args[])
    {
        ComTry.input();
        
        int lim=3,i=0, j, k;
        int a[] =new int[lim];
        
        while (lim!=0)//Extracting and storing digits in a[]
        {
            a[lim-1]=n%10;
            n=n/10;
            lim--;
        }
        
        System.out.println("All possible letter combinations:");
        for (i=0; i<arr[a[0]].length; i++)
        {
            for (j=0; j<arr[a[1]].length; j++)
            {
                for (k=0; k<arr[a[2]].length; k++)
                {
                    s=arr[a[0]][i] + arr[a[1]][j] + arr[a[2]][k];
                    System.out.println(s);
                }
            }
        }
    }
    
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        String code;
        System.out.println("Enter a 3-digit code");
        while (flag==0)
        {
            code=sc.next();
            if(code.length()==3)
            {
                n=Integer.parseInt(code);
                flag=1;
                sc.close();
            }
            else 
            {
                System.out.println("WRONG INPUT: Please enter a number greater than or equal to 0");
            }
        }
    }
}
