class OverLoad2
{
    void num_calc(int num, char ch)
    {
        if (ch=='s')
        {
            System.out.println(num*num);
        }
        else
        {
            System.out.println(num*num*num);
        }
    }
    void num_calc(int a, int b, char ch)
    {
        if (ch=='p')
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a+b);
        }
    }
    void num_calc(String s1, String s2)
    {
        if (s1.equals(s2)==true)
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("They are not equal");
        }
    } 
}