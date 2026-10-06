class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        int open=0;
       
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
            open++;
           }
           else if(s.charAt(i)==')' && open>0){
            open--;
           }
           else{
           ans++;
           }
        }
      ans =ans+open;
      return ans;
    }
}