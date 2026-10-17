class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int help[][] = new int[n][2];
 for (int i=0; i<n;i++) {
            int val =nums[i];
            int sum= 0;

            while(val > 0) {
        int temp = val % 10;
                sum =sum +temp;
                val = val /10;
            }

            help[i][0]=sum;
            help[i][1]=nums[i];
        }

        Arrays.sort(help, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < n; i++) {
            map.put(help[i][1], i);
        }

        boolean vis[]=new boolean[n];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (vis[i] || map.get(nums[i]) == i) {
                continue;
            }

            int j = i;
            int count = 0;

            while (!vis[j]) {
                vis[j] = true;
                j = map.get(nums[j]);
                count++;
            }

            ans =ans + count - 1;
        }

        return ans;
    }
}