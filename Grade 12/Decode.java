import java.util.*;
class Decode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the encoded string"); //Accepting the encoded string
        String s=sc.nextLine();                               
        int l = s.length();
        s = s.toUpperCase(); //Converting the encoded string into Uppercase
        s = s + " "; //Adding a space at the end
        if(l>=100) // Checking whether the length of the String is valid
            System.out.println("Invalid Length of Coded Text");
 
        else
        {
            System.out.print("Enter the Shift Value : ");
            int shift=sc.nextInt();
            if(shift<1 || shift>26) // Checking whether the shift value is valid
                System.out.println("Invalid Shift Value");
 
            else
            {
                int a, b;
                char ch1, ch2;
                String dec="";              
                for(int i=0;i<l;i++)
                {
                    ch1=s.charAt(i); //Extracting characters one by one
                    ch2=s.charAt(i+1); //Extracting the next character
                    a=ch1+shift-1; //Storing ASCII values after adding shift to the current character
                    b=ch2+shift-1; //Storing ASCII values after adding shift to the next character
                    if((char)a=='Q'&&(char)b=='Q')//Checking for spaces
                    {
                        a=32;
                        i++;
                    }
                    if(a>90)
                        a = a - 26;
                    if(ch1 != ' ')
                        dec=dec+(char)a; // Adding decoded character to the new String
                }
                System.out.println("Decoded Text : "+dec);
            }
        }
    }
}