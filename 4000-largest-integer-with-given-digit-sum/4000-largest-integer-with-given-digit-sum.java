class Solution {
    public int largestInteger(int n, int s) {
        int pos=9*n;
        if(s>pos){
            return -1;
        }
        int ans=0;
        for(int i=0;i<n;i++){
      
         int digit=Math.min(9,s);
         ans=ans*10+digit;
         s=s-digit;
        }
        
        return ans;
    }
}