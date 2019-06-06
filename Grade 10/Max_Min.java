class Max_Min
{
    public static void main(String args[])
    {
        int a[]={2, 5, 4, 1, 3};
        int max=a[0], min=a[0], sum=a[0], i;
        for (i=1;i<5;i++)
        {
            sum=sum+a[i];
            if (max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }  
        System.out.println("Minimum value:"+min);
        System.out.println("Maximum value:"+max);
        System.out.println("Sum of elements:"+sum);
    }
}