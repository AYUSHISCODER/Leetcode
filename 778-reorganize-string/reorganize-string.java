class Solution {
    class pair{
        char ch;
        int freq;
         pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
    }
   
    public String reorganizeString(String s) {
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)->{ 
                return b.freq-a.freq;
            }
        );
        int count[]=new int[26];
     for(char c: s.toCharArray()){
        count[c-'a']++;
     }
     for(int i=0;i<26;i++){
        if(count[i]>0){
            pq.add(new pair((char)('a'+i), count[i]));

        }
     }
     StringBuilder ans=new StringBuilder();
    while(pq.size()>=2){
        pair p1= pq.poll();
        pair p2=pq.poll();
        ans.append(p1.ch);
        ans.append(p2.ch);
        p1.freq--;
        p2.freq--;
        if(p1.freq>0){
            pq.add(p1);
        }
        if(p2.freq>0){
            pq.add(p2);
        }}
        if(!pq.isEmpty())
{
    pair last=pq.poll();
    if(last.freq>1){
        return "";
    }
    ans.append(last.ch);
}
 return ans.toString();
    }
}