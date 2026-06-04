class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                continue;
            }
            else{
                if(st.peek()==c){
                    st.pop();
                    continue;
                }
            }
            st.push(c);
        }
       StringBuilder sb = new StringBuilder();
for(char c : st) {
    sb.append(c);
}
return sb.toString();
    }
}