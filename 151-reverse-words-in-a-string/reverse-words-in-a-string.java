class Solution {
    public String reverseWords(String s) {
        Stack<String> st=new Stack<>();
        String word[]=s.split(" ");
        for(String w : word){
            if(!w.equals("")){
            st.push(w);
        }}
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(!st.isEmpty()){
                ans.append(" ");
            }
        }
        return ans.toString();

    }
}