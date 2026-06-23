class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> help=new ArrayList<>();
        int id=1;
        int sum=0;
        fun(ans,help,n,id,k);
        return ans;

    

    }

    public void fun(List<List<Integer>> ans, List<Integer> help,int n,int id,int k){
       if(help.size()==k){
        ans.add(new ArrayList<>(help));
        return;
       }
       for(int i=id;i<=n;i++){
        help.add(i);
        fun(ans,help,n,i+1,k);
        help.remove(help.size()-1);
       }

    }
}