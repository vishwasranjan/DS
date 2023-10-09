// In this approach, every set of items are tried, and for every set, the value is calculated. 
// The set that generates the maximum value is the answer.
// The following program implements the brute force approach using recursion.
class KnapSack{
    
    public int Max(int a,int b)
    {
        if(a>b)return a;
        else return b;
    }
    public int maxKnapsackValue(int wt[],int val[],int W,int n)
    {
        if(W==0 || n==0) return 0;  //Base Condition
        if(wt[n-1]<=W)
        {
            //We are adding the last element and checking if it is greater then we include or not
            return Max(val[n-1]+maxKnapsackValue(wt,val,W-wt[n-1],n-1),maxKnapsackValue(wt,val,W,n-1));
        }
        //if the weight of the item are greater then the capacity then we will not include
        else{
            return maxKnapsackValue(wt,val,W,n-1);
        }
    }

    //The need of dynamic programming occurred because the above approach is taking a large amount of time
    //to generate the result.

    public int maxKnapsackValueUsingDP(int wt[],int val[],int W,int n)
    {
        int t[][]=new int[W+1][n+1];//Matrix to memorize
        //In dp we need a matrix to memorize and the size of the matrix is only with those wholse value is
        //chnaging in recusrisve function call ....here n and w is changing and others are constant

        //On ver begining we are assigning all the values as -1
        for(int i=0;i<=W;i++)
        {
            for(int j=0;j<=n;j++)
            {
                t[i][j]=-1;
            }
        }

        if(W==0 || n==0) return 0;  //Base Condition

        //If we have alredy calculate the value and it is stored as it is not = -1 then we are directly
        //the value and not calling recursive function here
        if(t[W][n]!=-1) return t[W][n];

        if(wt[n-1]<=W)
        {
            //We are adding the last element and checking if it is greater then we include or not
            return t[W][n]=Max(val[n-1]+maxKnapsackValue(wt,val,W-wt[n-1],n-1),maxKnapsackValue(wt,val,W,n-1));
        }
        //if the weight of the item are greater then the capacity then we will not include
        else{
            return t[W][n]=maxKnapsackValue(wt,val,W,n-1);
        }
    }

    public static void main(String args[])
    {
        int wt[]={10,14,12};
        int val[]={5,5,9};
        int W=22;
        int n=3;
        KnapSack knapsack=new KnapSack();
        System.out.println("Using Dp"+knapsack.maxKnapsackValueUsingDP(wt,val,W,n));
        System.out.println(knapsack.maxKnapsackValue(wt,val,W,n));
    }
}