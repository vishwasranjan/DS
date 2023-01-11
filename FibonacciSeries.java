public class FibonacciSeries
{
    public static void Series(int a,int b,int n)
    {
        if(a+b>n){return;}
        System.out.println(a+b+" ");
        Series(b, a+b,n);
    }
    //0 1 1 2 3 5
    public static void main(String args[])
    {
        int a=0,b=1;
        int n=100;
        System.out.println(a+" "+b);
        Series(a, b,n);
    }
}