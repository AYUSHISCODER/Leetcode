class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftsum=0;
        int n=cardPoints.length;
        int rightsum=0;
        int maxsum=0;
        int rightind=n-1;
        for(int i=0;i<k;i++){
            leftsum=leftsum+cardPoints[i];
           
        }
         maxsum=leftsum;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-cardPoints[i];
            rightsum=rightsum+cardPoints[rightind];
            rightind--;
             maxsum=Math.max(maxsum,leftsum+rightsum);

        }
        return maxsum;
       
        
    }
}