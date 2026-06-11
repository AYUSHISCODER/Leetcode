class Solution {
    public int search(int[] nums, int target) {
        int min =findMin(nums);
        int low,high;
        if(target>=nums[min]&& target<=nums[nums.length-1]){
         high=nums.length-1;
         low=min;
          
        }
        else
        {
            high=min-1;
            low=0;
        }

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    public int findMin(int nums[]){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}