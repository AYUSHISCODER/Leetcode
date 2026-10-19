class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans=0;
        
        for(int i=0;i<worker.length;i++){
          int max=0;
          for(int j=0;j<profit.length;j++){
            if(worker[i]>=difficulty[j]){
                max=Math.max(max,profit[j]);
              
            }
          }  
          ans=ans+max;

        }
      
        return ans;
    
        
        
    }
}