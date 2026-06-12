class Solution {
    class pair{
        int index;
        int second;

        pair(int id,int dis){
            this.index=id;
            this.second=dis;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        int n=points.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<pair> pq=new PriorityQueue<>(
            (a,b)->{ 
                return b.second-a.second;
            }
        );
        for(int i=0;i<n;i++){
            int d=(points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
            map.put(i,d);
        }
        for(int key:map.keySet()){
            if(pq.size()<k){
                pq.add(new pair(key,map.get(key)));
            }
            else{
                if(map.get(key)<pq.peek().second){
                    pq.poll();
                    pq.add(new pair(key,map.get(key)));
                }
            }
 }
int idx=0;
int ans[][]=new int[k][2];
while(!pq.isEmpty()){
    int i=pq.poll().index;
    ans[idx][0]=points[i][0];
    ans[idx][1]=points[i][1];
    idx++;
}

 return ans;

    }
}