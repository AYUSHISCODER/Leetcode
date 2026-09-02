class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int res=0;
        
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            count++;
            }
        }
       // int res=0;
       res=count;
        int left=0;
        
        for(int right=k;right<n;right++){
               if(isVowel(s.charAt(right))){
                count++;
                
               }
               if(isVowel(s.charAt(left))){
                count--;
             
               }
               left++;
               res=Math.max(res,count);
        }
        return res;

    }
    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        else{
            return false;
        }
    }
}