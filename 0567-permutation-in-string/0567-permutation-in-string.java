class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int freq1[]=new int[26];
      int freq2[]=new int[26];
      for(char c: s1.toCharArray()){
        freq1[c-'a']++;
      }
      int left=0;
      for(int right=0;right<s2.length();right++){
        char c =s2.charAt(right);
        freq2[c-'a']++;
        if(right-left+1>s1.length()){
            char l=s2.charAt(left);
            freq2[l-'a']--;
            left++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }

      }
      return false;
    }
}