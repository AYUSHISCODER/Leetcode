class Solution {
    public int maxNumberOfBalloons(String text) {
        int n=text.length();
        int freq[]=new int[26];
        for(char c: text.toCharArray()){
            freq[c-'a']++;
        }
        int bal[]=new int[26];
        String ball="balloon";
        for(char c: ball.toCharArray()){
            bal[c-'a']++;
        }
  int res=Integer.MAX_VALUE;
        for(char c: ball.toCharArray()){
            int min= freq[c-'a']/bal[c-'a'];
            res=Math.min(res,min);
            
        }
        return res;
    }
}