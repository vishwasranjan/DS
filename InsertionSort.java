//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hand
//We will choose a word and insert it in its position(Ascenduing or descending)
class InsertionSort{
    public void Sort(int a[])
    {
        // 5 1 6 2 4
        for(int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
    }
    public static void main(String args[])
    {
        System.out.println("This is Insertion sort");
        int UA[]={5,1,4,2,7};
        InsertionSort is=new InsertionSort();
        is.Sort(UA);
        for(int i=0;i<UA.length;i++)
        {
            System.out.print(UA[i]+" ");
        }
    }
}