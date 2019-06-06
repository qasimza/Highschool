import java.util.*;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        char c, i;
        int count=0, j;
        s=s.toUpperCase();
        System.out.println("CHARACTER"+ '\t' + "FREQUENCY");
        for(i='A';i<='Z';i++)
        {
            for(j=0;j<s.length();j++)
            {
                if (i==s.charAt(j))
                {
                    count=count+1;
                }
            }
            if(count>0)
            {
                System.out.print(i);
                System.out.print('\t');
                System.out.print('\t');
                System.out.print(count);
                System.out.println();
            }
            count=0;
        }
    }
}
