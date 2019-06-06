import java.util.*;
class Admission
{
    int Adno[];
    Admission(int size)
    {
        Adno=new int[size];
    }
    void fillArray()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the elements");
        for (int i=0; i<Adno.length; i++)
        {
            Adno[i]=sc.nextInt();
        }
        sc.close();
    }
    void sortArray()
    {
        int t;
        for (int i=0; i<Adno.length-1; i++)
        {
            for (int j=1; j<Adno.length; j++)
            {
                if (Adno[i]>Adno[j])
                {
                    t=Adno[i];
                    Adno[i]=Adno[j];
                    Adno[j]=t;
                }
            }
        }
    }
    int binSearch(int l, int u, int v)
    {
        
        if (u<=l)
        {
            return -1;
        }
        else
        {
            int m=(u+l)/2;
            if (v<Adno[m])
            {
                return binSearch(l, m-1, v);
            }
            else if (v>Adno[m])
            {
                return binSearch(m+1, u, v);
            }
            else  
            {
                return 1;
            }
        }
        
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the size");
        int x=sc.nextInt();
        System.out.println ("Enter required value");
        int val=sc.nextInt();
        Admission ob = new Admission (x);
        ob.fillArray();
        ob.sortArray();
        System.out.println(ob.binSearch(0, ob.Adno.length, val));
    }
}