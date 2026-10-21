class Solution {
    public int[] applyOperations(int[] nums) {
      int n=nums.length;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            if(nums[i]==nums[j]){
                nums[i]=nums[i]*2;
                nums[j]=0;
            }
        }
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[ind]=nums[i];
                ind++;
            }
            
        }
        while (ind < n) {
    nums[ind] = 0;
    ind++;
}
        return nums;
        
    }
}