class Solution {
    class pair {
        int index;
        int second;

        pair(int id, int dis) {
            this.index = id;
            this.second = dis;
        }
    }

    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<pair> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.second, a.second)
        );

        for (int i = 0; i < points.length; i++) {

            int dist = points[i][0] * points[i][0]
                     + points[i][1] * points[i][1];

            if (pq.size() < k) {
                pq.offer(new pair(i, dist));
            } else if (dist < pq.peek().second) {
                pq.poll();
                pq.offer(new pair(i, dist));
            }
        }

        int[][] ans = new int[k][2];
        int idx = 0;

        while (!pq.isEmpty()) {
            int i = pq.poll().index;
            ans[idx][0] = points[i][0];
            ans[idx][1] = points[i][1];
            idx++;
        }

        return ans;
    }
}