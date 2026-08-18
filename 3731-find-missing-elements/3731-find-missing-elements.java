class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        int expected = nums[0];

        for(int num : nums) {

            while(expected < num) {
                ans.add(expected);
                expected++;
            }

            expected = num + 1;
        }

        return ans;
    }
}