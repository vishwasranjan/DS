public class BinarySearch
{
    public void search(int a[],int item)
    {
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while(li<=hi)
        {
            if(a[mi]==item)
            {
                System.out.println("Element is present at "+mi+"th position");
                break;
            }
            else if(a[mi]<item)
            {
                li=mi+1;
            }
            else
            {
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
    }
    public static void main(String args[])
    {
        int a[]={12,45,89,145,146,178,888};
        BinarySearch bs=new BinarySearch();
        bs.search(a,888);
    }
    
}
