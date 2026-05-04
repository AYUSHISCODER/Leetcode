class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=nums[k];
        }
        int result[]=new int[2];
        int count=0;
        Arrays.sort(nums);
        while(i<n){
            if(nums[i]+nums[j]==target){
                for(int a=0;a<n;a++){
                    if(arr[a]==nums[i] || arr[a]==nums[j]){
                        result[count]=a;
                        count++;
                    }
                }
                break;
            }
            else if(i<n && j>0 && nums[i]+nums[j] > target){
                j--;
            }
            else if(i<n && j>0 && nums[i]+nums[j] < target){
                i++;
            }
        }
        return result;
    }
}