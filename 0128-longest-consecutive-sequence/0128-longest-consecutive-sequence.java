class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x: nums){
            set.add(x);
        }
        int ans=0;
        
        for(int x : set){
             if(!set.contains(x-1)){
             int curr=x;
             int len=1;
             while(set.contains(curr++)){
                len++;
             }
             ans=Math.max(ans,len-1);

             }
        }
        return ans;
    }
}