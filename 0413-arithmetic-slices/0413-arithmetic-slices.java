class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans=0;
        int n=nums.length;
        int count=0;
        for(int i=2;i<n;i++){
            int dif1=nums[i]-nums[i-1];
            int dif2=nums[i-1]-nums[i-2];
            if(dif1==dif2){
                count++;
                ans=ans+count;
            }
            else{
                count=0;
            }
        }
        return ans;
    }
}