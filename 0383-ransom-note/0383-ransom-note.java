class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n1=ransomNote.length();
        int n2=magazine.length();
        HashMap<Character,Integer> r=new HashMap<>();
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<n1;i++){
            r.put(ransomNote.charAt(i),r.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<n2;i++){
            m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        }
    for(int i=0;i<n1;i++){
        if(r.getOrDefault(ransomNote.charAt(i),0)>m.getOrDefault(ransomNote.charAt(i),0)){
            return false;
        }
    }
    return true;
    }
}