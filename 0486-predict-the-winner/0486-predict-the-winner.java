class Solution {
    public boolean predictTheWinner(int[] nums) {
       int n=nums.length;
       int diff=fun(nums,0,n-1);
       return diff>=0; 
    }
    public int fun(int nums[],int left,int right){
        if(left==right){
            return nums[left];
        }

        int pickL=nums[left]-fun(nums,left+1,right);
        int pickR=nums[right]-fun(nums,left,right-1);
        return Math.max(pickL,pickR);
    }



}