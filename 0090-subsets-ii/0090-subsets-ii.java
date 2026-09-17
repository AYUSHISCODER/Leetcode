class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> help = new ArrayList<>();

        Arrays.sort(nums);

        fun(ans, help, nums, 0);

        return ans;
    }

    public void fun(List<List<Integer>> ans, List<Integer> help,
                    int[] nums, int id) {

        ans.add(new ArrayList<>(help));

        for(int i = id; i < nums.length; i++) {

            if(i > id && nums[i] == nums[i - 1]) {
                continue;
            }

            help.add(nums[i]);

            fun(ans, help, nums, i +1);

            help.remove(help.size() - 1);
        }
    }
}