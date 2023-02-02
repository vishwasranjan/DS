public class Recursion {
    //Print Name 5 Times using Recursion
    public void PrintNameFiveTimes(int i,int n)
    {
        if(i>n){return;}    //Base Condition
        System.out.println(i+" : Vishwas");
        PrintNameFiveTimes(i+=1, n);
    }

    //Print from 1-N
    public void PrintNumbers(int i,int n)
    {
        if(i>n){return;}
        System.out.print(i+" ");
        PrintNumbers(i+=1, n);
    }
    //Print from N-1
    public void PrintNumbersDesc(int n,int i)
    {
        if(n<i){return;}
        System.out.print(n+" ");
        PrintNumbersDesc(n-1,i);
    }
    //Recursion - Paramaetrised and Function
    //Sum of first n numbers(Paramerized)
    public void SumOfNnumbers(int n,int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
        SumOfNnumbers(n-1, sum+n);
    }
    //Sum of first n numbers (Functional)
    public int SumOfNumbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+SumOfNumbers(n-1);
    }
    

    //Swapping an array
    public void ReverseArray(int i,int j,int[] arr)
    {
        if(i<j){
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            ReverseArray(i+1, j-1, arr);
        }
        
    }
    
    public static void main(String args[])
    {
        Recursion recursion=new Recursion();
        recursion.PrintNameFiveTimes(1, 5);
        System.out.println("i-n");
        recursion.PrintNumbers(1, 10);
        System.out.println();
        System.out.println("n-i");
        recursion.PrintNumbersDesc(10, 1);
        System.out.println();
        System.out.println("Sum of first n numbers(Parametrized)");
        recursion.SumOfNnumbers(4, 0);
        System.out.println();
        System.out.println("Sum of first n numbers(Functional)");
        System.out.println(recursion.SumOfNumbers(4));
        System.out.println();
        System.out.println("Swapping the array 123456789");
        int a[]={1,2,3,4,5,6,7,8,9};
        recursion.ReverseArray(0,a.length-1, a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        

        
    }
}
