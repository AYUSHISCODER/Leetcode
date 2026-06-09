class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int max=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }}
         int min=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
            }}
        return (long)k*(max-min);
        
        
        
    }
}