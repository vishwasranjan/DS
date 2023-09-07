// It is a simple algorithm that compares the first element with the next one
// If the first one is greater then second one then swap the two element
public class BubbleSort
{
    public void Search(int a[])
    {
        int temp;
        for(int i=0;i<a.length;i++) //no of iteration in bubble sort
        {
            int flag=0;
            //-i is beacuse at every iteration the last bigger element is shifted at last so no need
            //to check further for that element
            for(int j=0;j<a.length-1-i;j++) //traversing the array
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(falg==0){ break; } //if the list is sorted then no need to traverse further
        }
    }
    public static void main(String args[])
    {
        System.out.println("This is bubble sort");
        int UA[]={5,7,3,10,11,1,3};
        BubbleSort bs=new BubbleSort();
        bs.Search(UA);
        for(int i=0;i<UA.length;i++)
        {
            System.out.print(UA[i]+" ");
        }

    }
}