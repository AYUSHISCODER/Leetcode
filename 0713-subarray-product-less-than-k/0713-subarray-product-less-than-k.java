class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int left=0;
        int sum=0;
        int prod=1;
        int right=0;
        int n=nums.length;
        if(k<=1){
            return 0;
        }
        while(right<n){
             prod=prod*nums[right];
        while(prod>=k){
            prod=prod/nums[left];
            left++;
        
        }
       
        if(prod<k){
            count+=right-left+1;
        }
        right++;
        }
        return count;
    }
}