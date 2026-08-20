class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
        List<Integer> help=new ArrayList<>();
            for(int j=0;j<=i;j++){
             if(j==0 || j==i){
                help.add(1);
             }
             else{
                int val=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                help.add(val);
             }
           
            }
            ans.add(help);
        }
      //  List<Integer> finalans=new ArrayList<>();
       // int n=rowIndex
       
        return ans.get(rowIndex);
    }
}