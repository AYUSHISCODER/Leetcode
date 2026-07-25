class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int pair[][]=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=capital[i];
            pair[i][1]=profits[i];
        }
       Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int idx=0;
        while(k-->0){
            while(idx<n){
                if(pair[idx][0]>w){
                    break;
                }
                pq.add(pair[idx][1]);
                
            idx++;
            }
             if(pq.isEmpty()){
            return w;
        }
        else{
            w=w+pq.peek();
            pq.poll();
        }

        }
        return w;
       

    }
}