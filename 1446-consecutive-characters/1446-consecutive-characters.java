class Solution {
    public int maxPower(String s) {
        int ans=Integer.MIN_VALUE;
         int left=0;

         int count=1;
         if(s.length()==1){
            return 1;
         }
         for(int right=1;right<s.length();right++){
         if(s.charAt(right-1)==s.charAt(right)){
         count++;
         }
         else{
            count=1;
         }
         ans=Math.max(count,ans);
         }
         return ans;
    }
}