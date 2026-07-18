class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int small=nums[0];
        int big=nums[n-1];
        int ans=1;
        for(int i=1;i<=small;i++){
            if(small%i==0 && big%i==0){
                ans=i;
            }
        }
        return ans;
    }
}