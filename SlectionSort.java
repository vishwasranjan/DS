//Selection sort is an sorting algorithm that selects the samllest elelment from an unsorted list in each
//iteration and places them at the begining of the unsorted list
class SlectionSort{
    public void Sort(int a[])
    {
        int min,temp=0;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;  //finding the position of smallest number
                }
            }
            //Swapping it with the samllest number
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    public static void main(String args[])
    {
        SlectionSort ss=new SlectionSort();
        int UA[]={10,4,5,1,8};
        ss.Sort(UA);
        for (int i=0;i<UA.length;i++)
        {
            System.out.print(UA[i]+" ");
        }
    }
}