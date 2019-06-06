import java.util.*;
class Merge
{
    public static void main (String args []) 
    {
        Scanner sc= new Scanner(System.in);
        int l1, l2, i, j, k, l, r;
        System.out.println("Enter size of first array");
        l1=sc.nextInt(); //Accepting size of first array
        System.out.println("Enter size of second array");
        l2=sc.nextInt(); //Accepting size of second array
        l=l1+l2;
        String s []= new String [l];
        System.out.println("Enter the elements of the first array");
        String s1 []= new String [l2];
        for (i=0;i<l1;i++) //Accepting elements of first array
        {
            s1[i]=sc.nextLine();
            s[i]=s1[i];
        }
        System.out.println("Enter the elements of the second array");
        String s2 []= new String [l2];
        for (i=0;i<l2;i++) //Accepting elements of second array
        {
            s2[i]=sc.nextLine();
            s[1+i]=s2[i];
        }
        for (i=0;i<l;i++) //Removing duplicates
        {
            for (j=i+1;j<l;j++)
            {
                if (s[i]==s[j])
                {
                    r=j;
                    for (k=j+1;k<l;k++)
                    {
                        s[r]=s[k];
                        r++;
                    }
                    l--;
                    j--;
                }
            }
        }
        System.out.println("The new array is:");
        for (i=0;i<l;i++)
        {
            System.out.println(s[i]);
        }
    }
}
