class Solution {

    class Pair {
        char task;
        int freq;

        Pair(char task, int freq) {
            this.task = task;
            this.freq = freq;
        }
    }

    public int leastInterval(char[] tasks, int n) {

        int[] count = new int[26];

        for (char ch : tasks) {
            count[ch - 'A']++;
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                pq.offer(new Pair((char)('A' + i), count[i]));
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Pair> temp = new ArrayList<>();
            int cycle = n + 1;

            while (cycle > 0 && !pq.isEmpty()) {

                Pair curr = pq.poll();

                curr.freq--;
                time++;
                cycle--;

                if (curr.freq > 0) {
                    temp.add(curr);
                }
            }

            for (Pair p : temp) {
                pq.offer(p);
            }

            if (pq.isEmpty()) {
                break;
            }

            time += cycle; 
        }

        return time;
    }
}