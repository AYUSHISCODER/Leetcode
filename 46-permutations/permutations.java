class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> help=new ArrayList<>();
    boolean present[]=new boolean[nums.length];
    int id=0;
    int n=nums.length;
  fun(nums,ans,help,n,id,present);
  return ans;
   
    }
    public void fun(int []nums,List<List<Integer>> ans,List<Integer> help,int n,int id,boolean[]present){
        if(id==n){
            ans.add(new ArrayList<>(help));
            return;
        }
        for(int i=0;i<n;i++){
             if(present[i]==false){
            help.add(nums[i]);
            present[i]=true;
             
             fun(nums,ans,help,n,id+1,present);
             help.remove(help.size()-1);
             present[i]=false;
             }
        }
    }
}