class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[m+n];
        merge( nums1,nums2,  ans,m,n);
        double sol=0;
        int len=ans.length;
        if(len%2==0){
            int mid=(len/2);
            double el1=ans[mid];
            double el2=ans[mid-1];

              
            sol=(el1+el2)/2;
 }
 else{
    int mid=len/2;
    double el=ans[mid];
    sol=el;

 }
 return sol;
    }
    public void merge(int []nums1,int []nums2,int []ans,int m,int n){
        int index=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                ans[index]=nums1[i];
                i++;
                index++;
            }
            else {
                ans[index]=nums2[j];
                j++;
                index++;
            }
        }
        while(i<n){
            ans[index]=nums1[i];
            index++;
            i++;
        }
        while(j<m){
            ans[index]=nums2[j];
            index++;
            j++;
        }
    }
}