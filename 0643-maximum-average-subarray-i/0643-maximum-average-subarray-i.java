class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=k-1;
        double avg=0;
        int sum=0;
        for(int i=0;i<=high;i++){
         sum=sum+nums[i];
        }
        int res=sum;

        while(high<n){
            res=Math.max(sum,res);
            high++;
            low++;
            if(high==n){
                break;
            }
            sum=sum-nums[low-1]+nums[high];


        }
        return (double) res/k;
        
    }
}