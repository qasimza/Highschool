import java.util.*;
class time
{
    private int hh, mm, ss;
    public void accept(int h, int m, int s)
    {
        hh=h;
        mm=m;
        ss=s;
    }
    public void sec()
    {
        int a=hh*60*60+mm*60+ss;
        System.out.println("Time in seconds="+a);
    }
    public void stan(int s)
    {
        hh=s/3600;
        s=s-hh*3600;
        mm=s/60; 
        s=s-mm*60;
        System.out.println("Time= "+hh+":"+mm+":"+s);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("To covert time into seconds press 1");
        System.out.println("To covert seconds into hh:mm:ss format press 2");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        time t= new time();
        int h, m, s;
        switch (ch)
        {
            case 1:
            System.out.println("Enter the time in hh:mm:ss format");
            h=sc.nextInt();
            m=sc.nextInt();
            s=sc.nextInt();
            t.accept(h, m, s);
            t.sec();
            break;
            case 2:
            System.out.println("Enter the time in seconds");
            s=sc.nextInt();
            t.stan(s);
            break;
            default:
            System.out.println("ERROR: Wrong Choice");
        }
    }
}
    