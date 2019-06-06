import java.util.*;

class SortNames
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the names");
        String n[]=new String[20];
        int i, j;
        String t;
        for (i=0;i<20;i++)
        {
            n[i]=sc.nextLine();
        }
        
        for (i=0;i<=20;i++)
        {
            for (j=0;j<=18-i;j++)
            {
                if (n[j].compareTo(n[j+1])>0)
                {
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }
        
        System.out.println("The names in alphabetical order are :");
        for (i=0; i<20; i++)
        { 
            System.out.println(n[i]);
        }
        
    }
}
        
        