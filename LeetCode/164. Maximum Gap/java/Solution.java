class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        return IntStream.range(0, nums.length - 1)
                .map(i -> nums[i + 1] - nums[i])
                .max()
                .orElse(0);
    }
}