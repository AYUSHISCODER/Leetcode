class Solution {
    public boolean uniformArray(int[] nums1) {
        int min_Even=Integer.MAX_VALUE;
        int min_Odd=Integer.MAX_VALUE;

        int n=nums1.length;
        for(int i=0;i<n;i++){
         if(nums1[i]%2==0){
            min_Even=Math.min(nums1[i],min_Even);
         }
         else{
            min_Odd=Math.min(nums1[i],min_Odd);
         }
        }
        if(min_Even==Integer.MAX_VALUE || min_Odd==Integer.MAX_VALUE){
            return true;
        }
        if(min_Even<min_Odd ){
            return false;
        }

       
        
        return true;
    }
}