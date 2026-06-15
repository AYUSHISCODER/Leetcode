class Solution {
   class pair{
    char ch;
    int freq;
     
     pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
     }

   }
    public String frequencySort(String s) {
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)->{
                return b.freq-a.freq;
            }
        );
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char k:map.keySet()){
            pq.add(new pair(k,map.get(k)));
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            pair p= pq.poll();
            int  f=p.freq;
            for(int i=0;i<f;i++){
                sb.append(p.ch);
            }
            
        }
        return sb.toString();
       
    }
}