class Solution {
   class pair{ int first;
    int second;
    pair (int f,int s){
        this.first=f;
        this.second=s;
    }}
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)->{
                
            
                    return b.second-a.second;
                
            }
        );
       for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(int key : map.keySet()){
        pq.add(new pair(key,map.get(key)));
    }
    int [] ans=new int[k];
    for(int i=0;i<k;i++){
        ans[i]=pq.poll().first;
    }
    return ans;

    
    }
    
}