class Solution {
    public int minMaxGame(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int x :nums){
            ans.add(x);
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int flag=0;
        while(ans.size()>1){
            
            for(int i=0;i<ans.size();i++){
              if(flag==0){
                ans.set(i,Math.min(ans.get(i),ans.get(i+1)));
                ans.remove(i+1);
                flag=1;
              }
              else if(flag==1){
                ans.set(i,Math.max(ans.get(i),ans.get(i+1)));
                ans.remove(i+1);
                flag=0;
              }
            }
        }
        return ans.get(0);
    }
}