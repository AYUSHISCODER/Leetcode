class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int ans[]=new int[n];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
         int id=index[i];
         list.add(id,nums[i]);
        }
        for(int i=0;i<n;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}