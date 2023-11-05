class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int cursor = 0;
        for (int num : nums) {
            if (num != val) {
                nums[cursor] = num;
                cursor++;
            }
        }
        return cursor;
    }
}