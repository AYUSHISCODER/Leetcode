class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0, right = nums.length-1, index = nums.length-1;
        while (left <= right) {
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if (leftSquare < rightSquare) {
                result[index--] = rightSquare;
                right--;
            } else {
                result[index--] = leftSquare;
                left++;
            }
        }

        return result;
    }
}