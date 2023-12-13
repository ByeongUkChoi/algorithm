class Solution {
    public int maximumProduct(int[] nums) {
        int l = nums.length;
        nums = Arrays.stream(nums).sorted().toArray();
        int max = nums[l - 3] * nums[l - 2] * nums[l - 1];
        if (nums[0] < 0) {
            max = Math.max(max, nums[0] * nums[l - 2] * nums[l - 1]);
            if (nums[1] < 0) {
                max = Math.max(max, nums[0] * nums[1] * nums[l - 1]);
            }
        }
        return max;
    }
}