class Solution {
    public int maximumDifference(int[] nums) {
        int profit=-1;
        int minval=nums[0];
        for(int i=0;i<nums.length;i++){
            minval=Math.min(minval,nums[i]);
            
            profit=Math.max(profit,nums[i]-minval);
        }
        if(profit==0){
            return -1;
        }
        return profit;
    }
}