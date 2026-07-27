class Solution {
    public String removeOuterParentheses(String s) {
        //Stack<Character > st=new Stack<>();

        StringBuilder ans=new StringBuilder();
        int num=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                if(num>0){
                ans.append(ch);}
                num++;
            }
            else{
                num--;
                if(num>0)
                ans.append(ch);
                
            }

     

        }
        return ans.toString();
    }
}