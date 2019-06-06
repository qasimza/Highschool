import java.util.*;
class Matrix
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String.");
        String s=sc.nextLine();
        sc.close();
        int i,j, r=0, c=1, a=0;
        String w="";
        for (i=0;i<s.length();i++)//TO FIND NO. OF COLUMNS(=NO. OF WORDS) AND NO. OF ROWS(=LENGTH OF LONGEST WORD)
        {
            if(s.charAt(i)==' ')
            {
                c++;
                if ((i-a)>r)
                {
                    r=i-a;
                }
                a=i+1;
            }
        }
        if ((s.length()-a)>r)
        {
            r=s.length()-a;
        }
        
       char x[][]=new char[r][c];
        Scanner z=new Scanner (s);
        a=0;
        while(z.hasNext()) //STORING WORDS IN ARRAY
        {
                w=z.next();
                for(j=0;j<w.length();j++)
                {
                    x[j][a]=w.charAt(j);
                }
                for(j=w.length();j<r;j++)
                {
                    x[j][a]=' '; 
                }
                a++;
       }
       
       for (i=0;i<r;i++) //PRINTING
        {
            for(j=0;j<c;j++)
            {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
      
    }
}