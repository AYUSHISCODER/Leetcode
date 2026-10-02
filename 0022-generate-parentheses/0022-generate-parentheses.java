class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder temp=new StringBuilder();
      List<String> ans=new ArrayList<>();
      fun(ans,temp,0,0,n);
      return ans;

    }
    public void fun(List<String>ans,StringBuilder temp,int open,int close,int n){
        if(open==n && close==n){
            ans.add(temp.toString());
            return;
        }
        if(open<n){
            temp.append("(");
            fun(ans,temp,open+1,close,n);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close<open){
            temp.append(")");
            fun(ans,temp,open,close+1,n);
            temp.deleteCharAt(temp.length()-1);
        }
    }

}