import java.util.*;

class Overload
{
    void compare(int a, int b)
    {
        System.out.println("The greater number is "+(a>b?a:b));
    }
    void compare(char a, char b)
    {
        System.out.println("The greater character is "+((int)a>(int)b?a:b));
    }
    void compare(String a, String b)
    {
        System.out.println("The longer String is "+(a.length()>b.length()?a:b));
    }
}