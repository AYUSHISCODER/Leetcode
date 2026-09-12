class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int window=2*k+1;
        //int left=0;
        
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=-1;
        }
        if(n<window){
       return  ans;        } 
    
    long sum=0;
    for(int i=0;i<window;i++){
       sum=sum+nums[i];
    }
    ans[k] = (int)(sum / window);

     for (int i = window; i < n; i++) {

     sum =sum-nums[i- window];
        sum =sum +nums[i];

        int center =i -k;
ans[center] = (int)(sum / window);
        }

        return ans;
    }
}