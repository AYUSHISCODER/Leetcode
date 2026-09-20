class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int help[]=new int[n+1];
        for(int i=0;i<n;i++){
            int index=nums[i];
            help[index]--;
        }
        for(int i=0;i<n+1;i++){
            if(help[i]<-1){
             return   i;
            }
        }
        return -1;
    }
}