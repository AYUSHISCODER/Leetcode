class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n=candidates.length;
        int id=0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        fun(ans,help,n,id,candidates,target);
        return ans;
    }
    public void fun( List<List<Integer>> ans,List<Integer> help,int n,int id,int []candidates,int target){

      
            if(target==0){

        
            ans.add(new ArrayList<> (help));
            return ;
        }
        for(int i=id;i<n;i++){
            if(i>id && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            help.add(candidates[i]);
           fun(ans,help,n,i+1,candidates,target-candidates[i]);
           help.remove(help.size()-1);
        }
    
    }
}