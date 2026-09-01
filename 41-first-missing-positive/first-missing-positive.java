class Solution {
    public int firstMissingPositive(int[] nums) {
HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
       if(nums[i]>0){
        set.add(nums[i]);
       }
        }
        for(int i=0;i<n;i++){
           if(nums[i]>0){
            min=Math.min(min,nums[i]);
           }
        }
        if(min!=1){
            return 1;
        }
        while(true){
            if(!set.contains(min+1)){
                return min+1;
            }
            min=min+1;
        }
        
        
        
    }
}