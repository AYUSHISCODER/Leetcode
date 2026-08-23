class Solution {
    Integer dp[][];
    public int lengthOfLIS(int[] nums) {
       
        int n=nums.length;
        int i=0;
        int prev=-1;
         dp=new Integer[n+1][n+1];
        return fun(nums,n,i,prev);
    }
    public int fun(int []nums,int n,int i,int prev){
        if(i==n){
            return 0;
        }
        if(dp[i][prev+1]!=null){
            return dp[i][prev+1];
        }
        if(prev==-1 || nums[i]>nums[prev]){
            int c1=1+fun(nums,n,i+1,i);
            int c2= fun(nums,n,i+1,prev);
            return dp[i][prev+1]= Math.max(c1,c2);
        }
        return dp[i][prev+1]=fun(nums,n,i+1,prev);
    }
}