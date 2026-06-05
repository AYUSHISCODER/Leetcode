class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 2; i >= 0; i--) {
            st.push(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }
        return ans;
    }
}