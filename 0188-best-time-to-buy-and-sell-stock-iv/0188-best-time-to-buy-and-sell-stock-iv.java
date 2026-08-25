class Solution {
    Integer dp[][];
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int i=0;
        int a=2*k;
        dp=new Integer[n+1][a+1];
        return fun(prices,i,a,n);
    }
    public int fun(int prices[],int i,int a,int n){
        if(i==n){
            return 0;
        }
        if(a==0){
            return 0;
        }
        if(dp[i][a]!=null){
            return dp[i][a];
        }
        if(a%2==0){
            int c1=fun(prices,i+1,a-1,n)-prices[i];
            int c2=fun(prices,i+1,a,n);
            return dp[i][a] =Math.max(c1,c2);
        }
        else{
            int c1=fun(prices,i+1,a-1,n)+prices[i];
            int c2=fun(prices,i+1,a,n);
            return dp[i][a]= Math.max(c1,c2);
        }
    }
}