class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        int n= 0;
        while(pq.size()>1){
             n=pq.poll()-pq.poll();
             if(n!=0)
            pq.add(n);

        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
}