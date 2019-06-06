import java.util.*;

class Student
{
    String name;
    int age, m1, m2, m3, maximum;
    double average;
    Student(String s, int a, int b, int c, int d)
    {
        name=s;
        age=a;
        m1=b;
        m2=c;
        m3=d;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your age");
        age=sc.nextInt();
        System.out.println("Enter marks in three subjencts");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void compute()
    {
        maximum=(m1>m2?m1:m2)>m3?(m1>m2?m1:m2):m3;
        average=(m1+m2+m3)/3;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Marks in Subject 1: "+m1);
        System.out.println("Marks in Subject 2: "+m2);
        System.out.println("Marks in Subject 3: "+m3);
        System.out.println("Maximum: "+maximum);
        System.out.println("Average: "+average);
    }
    public static void main()
    {
        Student ob=new Student ("", 0, 0, 0, 0);
        ob.input();
        ob.compute();
        ob.display();
    }
}
