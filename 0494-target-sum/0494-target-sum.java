class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        int sum=0;
        return fun(nums,i,n,sum,target);
    }
    public int fun(int nums[],int i,int n,int sum,int target){
        if(i==n){
            if(sum==target){
                return 1;
            }
            return 0;
        }
        int take =fun(nums,i+1,n,sum+nums[i],target);
        int dont= fun(nums,i+1,n,sum-nums[i],target);

        return take+dont;
    }
}