class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(k<=1){
            return 0;
        }
        int low=0;
        int high=0;
        int prod=1;
        int count=0;
        while(high<n){
            prod=prod*nums[high];
            while(prod>=k){
                prod=prod/nums[low];
                low++;
            }
            count+=high-low +1;
            high++;

        }
        return count;
    }
}