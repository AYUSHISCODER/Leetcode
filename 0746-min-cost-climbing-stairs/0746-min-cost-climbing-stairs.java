class Solution {
    Integer dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new Integer[n+1];

       // int i=0;
        return Math.min(fun(cost,n,0),fun(cost,n,1));
    }
    public int fun(int[]cost,int n,int i){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }

        int take1=cost[i]+fun(cost,n,i+1);
        int take2=cost[i]+fun(cost,n,i+2);
        return dp[i]= Math.min(take1,take2);

    }
}