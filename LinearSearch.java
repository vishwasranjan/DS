import java.util.Scanner;

public class LinearSearch {
    
    public void search(int a[],int data)
    {
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
            if(data==a[i])
            {
                System.out.println("Element is present at "+(i+1)+"th position");
                temp++;
                return;
            }
        }
        if(temp==0)
        {
            System.out.println("Element is not found");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of Elements : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Element : ");
        int data=sc.nextInt();
        LinearSearch ls=new LinearSearch();
        ls.search(a, data);
    }
}
