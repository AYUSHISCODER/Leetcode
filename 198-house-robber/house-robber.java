class Solution {
    Integer dp[][];
    public int rob(int[] nums) {
        int n=nums.length;
        int i=0;
        int free=1;
        dp=new Integer[n+1][free+1];
    
        return fun(nums,n,i,free);
    }
    public int fun(int[]nums,int n,int i,int free){
        if(i==n){
            return 0;
        }
        if(free==0){
       return  fun(nums,n,i+1,1);
        }
        if(dp[i][free]!=null){
            return dp[i][free];
        }
        int c1=nums[i]+fun(nums,n,i+1,0);
        int c2=fun(nums,n,i+1,1);
        return dp[i][free]= Math.max(c1,c2);
    }
}