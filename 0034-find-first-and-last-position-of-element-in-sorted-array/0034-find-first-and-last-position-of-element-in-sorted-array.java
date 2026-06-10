class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=firstO(nums,target);
        int last=lastO(nums,target);
        return new int[]{first,last};
        
    }

    public int firstO(int nums[],int target){
        int left=0;
        int high=nums.length-1;
        int ans=-1;
        while(left<=high){
            int mid=left+(high-left)/2;
            if(nums[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
     public int lastO(int nums[],int target){
        int left=0;
        int high=nums.length-1;
        int ans=-1;
        while(left<=high){
            int mid=left+(high-left)/2;
            if(nums[mid]==target){
                ans=mid;
             left=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}