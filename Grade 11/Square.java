class Square
{
    public static void main (String args[])
    {
        int a=1, i=1, rtint;
        double rt;
        for(i=1;i<1000000;i++)
        {
            a=a*i;
            
            rt=Math.sqrt(a+10);
            
            rtint=(int)rt;
           
            if (rtint==rt)
            {
                System.out.println (a);
            }
        }
    }
}