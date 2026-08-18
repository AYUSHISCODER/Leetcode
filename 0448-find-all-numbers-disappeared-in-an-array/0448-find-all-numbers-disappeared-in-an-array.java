class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int n =nums.length;
        
        HashSet<Integer> set=new HashSet<>();
     
        for(int i=0;i<n;i++){
          set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}