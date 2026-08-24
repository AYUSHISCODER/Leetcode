class Solution {
    Integer dp[][];
    public int maxProfit(int[] prices) {
     int i=0;
     int k=2;
     int n=prices.length;
     dp=new Integer[n+1][k+1];
     return fun(prices,i,n,k);  
    }
    public int fun(int []prices,int i,int n,int k){
        if(i==n){
            return 0;
        }
        if(k==0){
            return 0;
        }
        if(dp[i][k]!=null){
            return dp[i][k];
        }
        if(k==2){
            int c1=fun(prices,i+1,n,k-1) - prices[i];
            int c2=fun(prices,i+1,n,k);
            return dp[i][2]= Math.max(c1,c2);
        }
        else{
            int c1=fun(prices,i+1,n,k+1)+prices[i];
            int c2=fun(prices,i+1,n,k);
            return  dp[i][1]=Math.max(c1,c2);
              
        }
    }
}