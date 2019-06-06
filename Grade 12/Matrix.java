import java.util.*;
class Matrix
{
    float a[][]=new float[3][3];
    float d;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter the elements of the matrix"); //Accepting the elements of the matrix
        int i, j;
        for (i=0;i<3;i++)
        {
            System.out.println ("Enter the elements of Row "+(i+1));
            for (j=0;j<3;j++)
            {
                a[i][j]=sc.nextFloat();
            }
        }
    }
    public void determinant()
    {
        d=a[0][0]*(a[1][1]*a[2][2]-a[2][1]*a[1][2])-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]); //Calculating determinant of matrix
     }
    public boolean check() //Checking if matrix is non-singular, i.e. derminant is not equal to 0
    {
        if (d==0)
            return false;
        else 
            return true;
    }
    public float cofactor(int r, int c) // Calculating cofactors of each element
    {
        int i, j, x=0;
        float mat[]=new float[4];
        for(i=0;i<3;i++)
        {
            if(i==r)
            {
                continue;
            }
            else
            {
                 for(j=0;j<3;j++)
                 {
                     if(j==c)
                     {
                         continue;
                     }
                     else
                     {
                         mat[x]=a[i][j];
                         x++;
                     }
                 }
            }
        }             
        if((r+c)%2==0)
        {
            return (mat[0]*mat[3]-mat[1]*mat[2]);
        }
        else 
        {
            return (-1)*(mat[0]*mat[3]-mat[1]*mat[2]);
        }
    }
    public static void main (String args[])
    {
        Matrix ob=new Matrix();
        ob.input();
        ob.determinant();
        if(ob.check()==false) //Checking if inverse exists
        {
            System.out.println ("Inverse does not exist");
        }
        else
        {
            int i, j; //Declaring variables
            float c;
            float b[][]=new float[3][3];
            for (i=0;i<3;i++) //Calculating inverse
            {
                for (j=0;j<3;j++)
                {
                    c=ob.cofactor(i, j);
                    b[j][i]=c/ob.d; 
                }
            }
            for (i=0;i<3;i++) //Displaying Inverse Matrix
            {
                for (j=0;j<3;j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
        }    
    }
}