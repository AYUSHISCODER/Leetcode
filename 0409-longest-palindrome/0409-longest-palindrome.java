class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int freq[]=new int[128];
        for(char c :s.toCharArray()){
         freq[c]++;
        }
        int ans=0;
        char odd=0;
        for(int f : freq){
            if(f%2==0){
               ans+=f;
            }
            else{
                ans+=(f/2)*2;
                odd=1;
            }
        }
        if(odd==1){
            return ans +1;
        }
        return ans;
        
    }
}