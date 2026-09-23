class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            total=total+num;
        }
        int target=total-x;
        int sum=0;
        int maxlen=-1;
        int left=0;
        if(target<0){
            return -1;
        }
        if(target==0){
            return n;
        }
        
        for(int right=0;right<n;right++){
         sum=sum+nums[right];
         while(sum>target){
            sum=sum-nums[left];
            left++;
         }
         if(sum==target)
         maxlen=Math.max(maxlen,right-left+1);

        }
        if(maxlen==-1){
            return -1;
        }
        return n-maxlen;
    }
}