class Sort
{
    public static void main (String args [])
    {
        int temp;
        int a []={5,8,1,21,10};
        System.out.println("The value of array before sorting ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                } 
                
            }
            
        }
            System.out.println("\nThe value of array after sorting ");

            for (int i=0;i<a.length;i++)
            {
            System.out.print(a[i]+" ");
            }
    }
}
