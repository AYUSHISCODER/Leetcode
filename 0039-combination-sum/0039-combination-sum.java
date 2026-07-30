class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  ans=new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        int i=0;
        int n=candidates.length;

         fun(ans,help,candidates,i,n,target);
         return ans;
    }
    public void fun( List<List<Integer>>  ans, List<Integer> help,int[] candidates,int index,int n,int target){
        if(target==0){
            ans.add(new ArrayList<>(help));
            return ;
        }
        if(index==n|| target<0){
            return ;
        }
        
        help.add(candidates[index]);
       fun(ans,help,candidates,index,n,target-candidates[index]);
        help.remove(help.size()-1);
        fun(ans,help,candidates,index+1,n,target);

    }
}