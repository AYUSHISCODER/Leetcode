//O(nlog(n))  try better

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
                
            
                    return a.second-b.second;
                
            }
        );
       for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }
       int count=0;
       for(int key : map.keySet()){
        if(pq.size()<k){
        pq.add(new pair(key,map.get(key)));
        }
        else{
             if(pq.peek().second<map.get(key)){
          pq.poll();
          pq.add(new pair(key,map.get(key)));
        }
          }  }
       int ans[]=new int[k];
       for(int i=0;i<k;i++){
       ans[i]=pq.poll().first;
       }

return ans;
    }
    }
