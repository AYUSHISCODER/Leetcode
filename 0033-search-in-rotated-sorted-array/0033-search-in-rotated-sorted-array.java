class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1){
        if(target==nums[0]){
            return 0;
        }
        }
        int min=findMin(nums);
        int low=0;
        int high=nums.length-1;
int l=0;
int r=0;
if(min==0){
    l=0;
    r=high;
}
       else  if(target>=nums[low] && target<=nums[min-1]){
         l=low;
         r=min-1;
        }
        else{
            l=min;
            r=high;
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    
    public int findMin(int []nums){
        int l=0;
        int r=nums.length-1;
        int min=Integer.MIN_VALUE;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }
            else if(nums[mid]<=nums[r]){
                r=mid;
            }
        }
        return l;
    }

}