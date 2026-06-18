class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        int id=Math.abs(nums[i])-1;
        if(nums[id]<0){
            ans.add(id+1);
        }
        else{
            nums[id]=-nums[id];
        }
       }
       return ans;
    }
}