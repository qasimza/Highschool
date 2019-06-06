import java.util.*;

class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rno[]=new int[50];
        int m1[]=new int[50];
        int m2[]=new int[50];
        int m3[]=new int[50];
        int i;
        double av[]=new double[50];
        for (i=0;i<50;i++)
        {
            System.out.println("Enter Student's Roll no.");
            rno[i]=sc.nextInt();
            System.out.println("Enter marks in Subject 1");
            m1[i]=sc.nextInt();
            System.out.println("Enter marks in Subject 2");
            m2[i]=sc.nextInt();
            System.out.println("Enter marks in Subject 3");
            m3[i]=sc.nextInt();
            av[i]=(m1[i]+m2[i]+m3[i])/3;
        }
        System.out.println("Students scoring above 80 are as follows");
        System.out.println("Roll No"+ '\t' + "Average");
        for(i=0;i<50;i++)
        {
            if(av[i]>80)
            {
                System.out.println(rno[i] + "           " +av[i]);
            }
        }
        System.out.println("Students scoring below 40 are as follows");
        System.out.println("Roll No"+ '\t' + "Average");
        for(i=0;i<50;i++)
        {
            if(av[i]<40)
            {
                System.out.println(rno[i] + "           " +av[i]);
            }
        }
    }
}