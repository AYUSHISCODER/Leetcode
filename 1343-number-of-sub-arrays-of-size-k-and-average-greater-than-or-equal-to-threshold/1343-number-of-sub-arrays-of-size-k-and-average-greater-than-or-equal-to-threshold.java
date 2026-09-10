class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length;
        int res=0;
        int sum=0;
        int avg=0;
        int left=0;
        int right=k;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(avg>=threshold){
            res++;
        }
        while(right<n){
          sum=sum+arr[right];
          sum=sum-arr[left];
          if(sum/k>=threshold){
            res++;
          }
          right++;
          left++;
        }
        return res;


    }
}