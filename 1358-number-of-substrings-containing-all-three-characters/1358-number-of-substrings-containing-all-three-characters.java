class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
       
        int count=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
         map.put(c,map.getOrDefault(c,0)+1);
         while(map.size()==3){
            count+=s.length()-right;
            char l=s.charAt(left);
            map.put(l,map.getOrDefault(l,0)-1);
            if(map.get(l)==0){
                map.remove(l);
            }
            left++;
         }
        
        }
        return count;

    }
}