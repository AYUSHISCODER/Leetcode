class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>help=new ArrayList<>();
        int n=nums.length;
        boolean used[]=new boolean[n];
        Arrays.sort(nums);
        return fun(nums,ans,help,n,0,used);
    }
    public List<List<Integer>> fun(int[]nums,List<List<Integer>> ans,List<Integer>help,int n,int pos,boolean used[]){
        if(pos==n){
           ans.add(new  ArrayList<>(help));
        }
        for(int i=0;i<n;i++){
            if(used[i]==true){
                continue;
            }
            if(i>0 && nums[i]==nums[i-1]&& !used[i-1]){
                continue;
            }
            help.add(nums[i]);
            used[i]=true;
            fun(nums,ans,help,n,pos+1,used);
            help.remove(help.size()-1);
            used[i]=false;
        }
        return ans;
    }
}