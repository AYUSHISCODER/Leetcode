class Solution {
  //  Integer dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
      int[]  dp=new int[n+2];

       // int i=0;
        dp[n]=0;
        dp[n+1]=0;
        for(int i=n-1;i>=0;i--){
            dp[i]=cost[i]+ Math.min(dp[i+1],dp[i+2]);

        }
        return Math.min(dp[0],dp[1]);

    }
    // public int fun(int[]cost,int n,int i){
    //     if(i>=n){
    //         return 0;
    //     }
    //     if(dp[i]!=null){
    //         return dp[i];
    //     }

    //     int take1=cost[i]+fun(cost,n,i+1);
    //     int take2=cost[i]+fun(cost,n,i+2);
    //     return dp[i]= Math.min(take1,take2);

    // }
}