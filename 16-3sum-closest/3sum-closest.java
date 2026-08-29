class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
            int sum=nums[i]+nums[left]+nums[right];
             int dif=Math.abs(target-sum);
             if(dif<ans){
                ans=dif;
                res=sum;

             }

             if(sum==target){
                break;
             }
             else if(sum<target){
                left++;
             }
             else{
                right--;
             }
            }
        }
        return res;
    }
}