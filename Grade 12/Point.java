import java.util.*;
class Point
{
    public double x;
    public double y;
    public double z;
    public void input() //Function for accepting coordinates of a point
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates of the point");
        System.out.print("Enter x-cordinate: ");
        x=sc.nextDouble();
        System.out.print("Enter y-cordinate: ");
        y=sc.nextDouble();
        System.out.print("Enter z-cordinate: ");
        z=sc.nextDouble();
        sc.close();
    }
    public double distance(Point r1, Point r2) //Calculating distance between 2 points
    {
        return Math.sqrt(Math.pow((r1.x-r2.x),2)+Math.pow((r1.y-r2.y),2)+Math.pow((r1.z-r2.z),2));
    }
    public double perimeter(double a, double b, double c)
    {
        double p=a+b+c;
        return p;
    }
    public double area(double a, double b, double c)
    {
        double s=(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public static void main (String args[])
    {
        Point p1=new Point();
        Point p2=new Point();
        Point p3=new Point();
        p1.input();
        p2.input();
        p3.input();
        double a=p1.distance (p1, p2); //Calculating side a 
        double b=p2.distance (p2, p3); //Calculating side b
        double c=p3.distance (p3, p1); //Calculating side c 
        System.out.println("Perimeter="+p1.perimeter(a, b, c)); //Displaying perimeter
        System.out.println("area="+p1.area(a, b, c)); //Displaying Area
    }
}