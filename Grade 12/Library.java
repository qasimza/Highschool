class Library
{
    String name;
    String author;
    float p;
    Library (String n, String a, float amt) //Constructor to assign values name, author and p
    {
        name= n;
        author=a;
        p=amt;
    }
    void show() //Funtion to display the Name of the book, its author and price
    {
        System.out.println ("Book: "+name);
        System.out.println ("Author: "+author);
        System.out.println ("Price: "+p);
    }
}
