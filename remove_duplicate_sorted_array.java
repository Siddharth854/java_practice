public class remove_duplicate_sorted_array
{
    public static void main(String[] args)
    {
        int[] a = {2,4,4,6,6,45,67};
        int j=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                a[j]=a[i];
                j++;
            }
        }
        a[j]=a[a.length-1];
        for(int i=0;i<j;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}
