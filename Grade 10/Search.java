import java.util.*;
class Search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n[]={5, 7, 9, 11, 15, 20, 30, 45, 89, 97};
        System.out.println("Enter the requred number");
        int num=sc.nextInt();
        int l=0, u=9, m, flag=0;
        while (l<=u)
        {
            m=(u+l)/2;
            if(num==n[m])
            {
               flag=1;
               break;
            }
            else if(num<n[m])
            {
                u=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        if(flag==1)
        {
            System.out.println("Search successful!");
        }
        else
        {
            System.out.println("Search unsuccessful!");
        }
    }
}
