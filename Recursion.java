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
    
    public static void main(String args[])
    {
        Recursion recursion=new Recursion();
        recursion.PrintNameFiveTimes(1, 5);
        System.out.println("i-n");
        recursion.PrintNumbers(1, 10);
        System.out.println();
        System.out.println("n-i");
        recursion.PrintNumbersDesc(10, 1);
        
    }
}
