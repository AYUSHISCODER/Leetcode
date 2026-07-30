class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int org=0;
        for(int i=1;i<n+1;i++){
org=org+i;
        }
        return org-sum;
        
    }
}