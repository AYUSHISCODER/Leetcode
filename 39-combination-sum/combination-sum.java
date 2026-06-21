class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
         List<Integer> sub= new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
         answer(candidates,sub,ans,0,target,n);
         return ans;
        
    }
    public static void answer(int[]candidates,List<Integer>sub,List<List<Integer>>ans,int id,int target,int n){

        if(id==n){
            if(target==0){
                ans.add(new ArrayList<>(sub));
            }
            return;
        }  
        

        if(candidates[id]<=target){
            sub.add(candidates[id]);
            answer(candidates,sub,ans,id,target-candidates[id],n);
            sub.remove(sub.size()-1);
        }
          answer(candidates,sub,ans,id+1,target,n);

    }
}