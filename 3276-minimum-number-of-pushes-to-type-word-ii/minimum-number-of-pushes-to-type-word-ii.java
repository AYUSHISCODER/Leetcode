class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
       
        for(char ch :word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int n=freq.length;
        int ans=0;
        int rank=0;
        for(int i=n-1;i>=0;i--){
            if(freq[i]==0){
                rank++;
                continue;
            }
            ans+=((rank/8)+1)*freq[i];
            rank++;
        }
        return ans;
    }
}