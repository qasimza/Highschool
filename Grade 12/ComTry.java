import java.util.*;

class ComTry
{
    static String arr [][]={{}, {"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o",}, {"p", "q", "r", "s"}, {"t","u","v"}, {"w", "x", "y", "z"}, {}};
    static int n;
    static String s="";
    public static void main (String args[])
    {
        //ComTry.input();
        n=234;
        int lim=0, temp=n, i=0, j, k;
        while (temp!=0)
        {
            lim++;
            temp=temp%10;
        }
        int a[] =new int[lim];
        while (lim!=0)
        {
            a[lim-1]=n%10;
            lim--;
        }
        for (i=0; i<arr[a[0]].length; i++)
        {
            for (j=0; j<arr[a[1]].length; j++)
            {
                for (k=0; k<arr[a[2]].length; k++)
                {
                    s=arr[a[0]][i] + arr[a[1]][j] + arr[a[2]][k];
                }
                System.out.println(s);
            }
        }
    }
    
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
                sc.close();
            }
            else 
            {
                System.out.println("WRONG INPUT: Please enter a number greater than or equal to 0");
            }
        }
    }
}
