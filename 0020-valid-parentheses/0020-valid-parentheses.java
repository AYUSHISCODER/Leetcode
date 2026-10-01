class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
          if(  s.charAt(i)=='('|| s.charAt(i)=='{'|| s.charAt(i)=='['){
            st.add(s.charAt(i));
          }
          if(st.isEmpty()){
            return false;
          }
          else if(s.charAt(i)==')'){
            if(st.pop()!='('){
                return false;
            }
          }
          else if(s.charAt(i)=='}'){
            if(st.pop()!='{'){
                return false;
            }
          }
           else if(s.charAt(i)==']'){
            if(st.pop()!='['){
                return false;
            }
          }
        }
        if(st.isEmpty())
        return true;

        return false;
    }
}