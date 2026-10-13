class Solution {
    public int climbStairs(int n) {
         int dp[] =new int[n+1];
        return fun(0,n,dp);
       
       
    }
   
    public int fun(int i,int n,int dp[]){
        
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }
        int take1=fun(i+1,n,dp);
        int take2=fun(i+2,n,dp);
        return  dp[i]=take1+take2;
    }
}