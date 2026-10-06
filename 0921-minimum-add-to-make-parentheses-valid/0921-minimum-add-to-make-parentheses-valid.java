class Solution {
    public int minAddToMakeValid(String s) {
        int ans=0;
        Stack<Character> open=new Stack<>();
        Stack<Character> close=new Stack<>();

        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('){
            open.push('(');
           }
           else if(s.charAt(i)==')' && open.isEmpty()){
            ans++;
           }
           else{
            open.pop();
           }
        }
      ans =ans+open.size();
      return ans;
    }
}