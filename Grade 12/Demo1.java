class Demo1
{
    public int a;
    public int b;
    private static int A;
    private static int B;
    Demo1 ()
    {
        a=0;
        b=3;
        
    }
    Demo1 (int x, int y)
    {
        a=x;
        b=y;
    }
    public static void main (String args[])
    {
        int i, j;
        i=9;
        j=30;
        Demo1 ob1=new Demo1();
        System.out.println("a="+ob1.a);
        System.out.println("b="+ob1.b);
        Demo1 ob2=new Demo1(i, j);
        System.out.println("a="+ob2.a);
        System.out.println("b="+ob2.b);
        A=5;
        B=6;
        System.out.println(A);
        System.out.println(B);
    }
}