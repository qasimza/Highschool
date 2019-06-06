import java.util.*;
class Merge
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int P[]= new int[6];
        int Q[]= new int[4];
        int R[]= new int[10];
        int i;
        for (i=0;i<6;i++)
        {
            System.out.println("Enter a number");
            P[i]=sc.nextInt();
            R[i]=P[i];
        }
        
        for (i=0;i<4;i++)
        {
            System.out.println("Enter a number");
            Q[i]=sc.nextInt();
            R[i+6]=Q[i];
        }
        
        System.out.println("The merged array is:");
        for(i=0; i<10; i++)
        {
            System.out.println(R[i]);
        }
    }
}
        
