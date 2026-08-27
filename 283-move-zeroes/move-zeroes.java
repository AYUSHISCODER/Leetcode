class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int j=n-1;
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[j]=0;
                j--;
            }
            else{
                ans[index]=nums[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=ans[i];
        }
        
     
    }
}