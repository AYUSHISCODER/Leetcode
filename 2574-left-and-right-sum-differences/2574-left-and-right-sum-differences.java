class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        left[0]=0;
        int leftsum=0;
        int rightsum=0;
        for(int i=1;i<n;i++){
          leftsum += nums[i-1];
         left[i]=leftsum;
        }
        int right[]=new int[n];
        right[n-1]=0;
        for(int i=n-2;i>=0;i--){
            rightsum+= nums[i+1];
            right[i]=rightsum;
        }
        int sum=0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
        sum=Math.abs(left[i]-right[i]);
        ans[i]=sum;
        }
        return ans;
        
    }
}