class Solution {
    public long maxAlternatingSum(int[] nums) {
          int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);
      
        int help[]=new int[n];
        int max=n-1;
        int min=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                help[i]=nums[max];
                max--;
            }
            else{
                help[i]=nums[min];
                min++;
            }
        }
        long sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+ (help[i]*help[i]);
            }
            else{
                sum=sum-(help[i]*help[i]);
            }
        }
        return sum;

    }
}