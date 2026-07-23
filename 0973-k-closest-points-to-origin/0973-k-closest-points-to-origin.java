class Solution {
    class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)-> {return b.second-a.second;
            }
        );
        for(int i=0;i<points.length;i++){
            int pos= (points[i][0]*points[i][0] )+ (points[i][1]*points[i][1]);
            map.put(i,pos);
        }
        for(int key : map.keySet()){
            if(pq.size()<k){
                pq.add(new pair(key,map.get(key)));
            }
            else{
                if(pq.peek().second >map.get(key)){
                    pq.poll();
                    pq.add(new pair(key,map.get(key)));

                }
            }
        }
        int ans[][]=new int[k][2];
        for(int i=k-1;i>=0;i--){
        pair p=pq.poll();
        ans[i]=points[p.first];
        }
   return ans;
    }
}