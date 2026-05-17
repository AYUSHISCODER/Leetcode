class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int l=0;
        int high=k-1;
        int res=0;
        int count=0;
        for(int i=0;i<=high;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
                res++;
            }
            count=res;
 }

high++;
while(high<n){
    char left=s.charAt(l);
    if(left=='a'|| left=='e'||left=='i'|| left=='o'|| left=='u'){
        count--;
    }
    l++;
    char right=s.charAt(high);
    if(right=='a'|| right=='e'|| right=='i'|| right=='o'||right=='u'){
        count++;
    }
    high++;

    res=Math.max(count,res);
}
return res;

        
    }
}