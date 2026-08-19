class Solution {
    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();

        for(int x : nums) {
            set.add(x);
        }

     
        if(set.size() < 3) {
            int ans = Integer.MIN_VALUE;

            for(int x : set) {
                ans = Math.max(ans, x);
            }

            return ans;
        }

        int count = 0;

        for(int x : set) {
            if(count < 3) {
                pq.add(x);
                count++;
            }
            else if(x > pq.peek()) {
                pq.poll();
                pq.add(x);
            }
        }

        return pq.peek();
    }
}