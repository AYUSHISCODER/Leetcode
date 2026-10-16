class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int temp1[]=new int[nums.length-1];
        int temp2[]=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            temp1[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            temp2[i-1]=nums[i];

        }
        int dp1[]=new int[nums.length];
             int dp2[]=new int[nums.length];
             for(int i=0;i<nums.length;i++){
                dp1[i]=-1;
                dp2[i]=-1;
             }
        int half1=fun(temp2,0,nums.length-1,dp1);
        int half2=fun(temp1,0,nums.length-1,dp2);
        return Math.max(half1,half2);
    }
    public int fun(int []temp,int i,int n,int dp[]){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=temp[i]+fun(temp,i+2,n,dp);
        int not= fun(temp,i+1,n,dp);
        return dp[i]= Math.max(take,not);
    }
}