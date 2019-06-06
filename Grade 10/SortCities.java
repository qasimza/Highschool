import java.util.*;

class SortCities
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String cities[]={"Delhi", "Bagalore", "Agra", "Mumbai", "Calcutta"};
        int i, j;
        String temp;
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(cities[i].compareTo(cities[j])>0)
                {
                    temp=cities[i];
                    cities[i]=cities[j];
                    cities[j]=temp;
                }
            }
        }
        System.out.println("The cities in alphabetical order are as follows:");
        for(i=0;i<5;i++)
        {
            System.out.println(cities[i]);
        }
    }
}
