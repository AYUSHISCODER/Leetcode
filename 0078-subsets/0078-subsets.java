class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        int n=nums.length;
        fun(ans,help,nums,n,0);
        return ans;
    }
    public void fun(List<List<Integer>> ans,List<Integer> help,int []nums, int n, int id){
        if(id==n){
            ans.add(new ArrayList<>(help));
            return;
        }
        help.add(nums[id]);
        fun(ans,help,nums,n,id+1);

        help.remove(help.size()-1);
        fun(ans,help,nums,n,id+1);
    }
}