class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int ans[]=new int[n1];
        for(int i=0;i<n1;i++){
            int j=0;
            int found=0;
            while(nums1[i]!=nums2[j]){
                j++;

            }
            for(int k=j+1;k<nums2.length;k++){
                if(nums2[k]>nums1[i]){
                    found=1;
                    ans[i]=nums2[k];
                    break;
                }}
                if(found==0){
                    ans[i]=-1;
                }

            
        }
        return ans;
        
    }
}