class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int open=0;
        int n=s.length();
    
        for(int i=0;i<n;i++){
            
             if(s.charAt(i)=='('){
                  if(open>0){
               ans=ans+s.charAt(i);
             }
                open++;
             }
             
            
             else if(s.charAt(i)==')'){
            open--;
            if(open>0){
                ans=ans+s.charAt(i);
            }
             }
            
    

        }
        return ans;
        
    }
}