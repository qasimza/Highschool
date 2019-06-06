import java.util.*;

class Combinations
{
    static int arr [][]={{}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o',}, {'p', 'q', 'r', 's'}, {'t','u','v'}, {'w', 'x', 'y', 'z'}, {}};
    static int n, i, j;
    static String s="";  
    public static void input()
    {
        Scanner sc=new Scanner(System.in);
        int num, flag=0;
        System.out.println("Enter a number greater than or equal to 0");
        while (flag==0)
        {
            num=sc.nextInt();
            if(num>=0)
            {
                n=num;
                flag=1;
            }
            else 
            {
                System.out.println("WRONG INPUT: Please enter a number greater than or equal to 0");
            }
        }
    }
    
    public static void combine()
    {
        if (n!=0)
        {
            for (i=0; i<arr[n%10].length; i++)
            {
                for (j=0; j<arr[i].length;j++)
                {
                    Combinations.combine();
                    s=arr[i][j]+s;
                }
                System.out.println(s);
            }
        }
        else 
        {
            return;
        }
    }
    
    public static void main (String args[])
    {
       Combinations.input();
       Combinations.combine();
    }
    
}