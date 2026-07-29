class Solution {
    Integer dp[][];
    public int rob(int[] nums) {
        int free=1;
        int n=nums.length;
        dp=new Integer[n][2];
        return fun(nums,n,0,free);
    }
    public int fun(int[]nums,int n,int i,int free){
        if(i==n){
            return 0;
        }
         if (dp[i][free] != null)
            return dp[i][free];
        if(free==0){
            return dp[i][free]= fun(nums,n,i+1,1);
        }
        int c1=nums[i]+fun(nums,n,i+1,0);
        int c2=fun(nums,n,i+1,1);
        return dp[i][free]= Math.max(c1,c2);
    }
}