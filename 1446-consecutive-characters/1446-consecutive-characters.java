class Solution {
    public int maxPower(String s) {

        int left = 0;
        int right = 0;
        int ans = 1;

        while (right < s.length()) {

            if (s.charAt(left) == s.charAt(right)) {
                ans = Math.max(ans, right - left + 1);
                right++;
            } else {
                left = right;
            }
        }

        return ans;
    }
}