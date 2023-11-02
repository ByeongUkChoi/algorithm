import java.util.Stack;

class Solution {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int cursor = 1;
        for (int i = 1; i < nums.length; i++) {
            if (stack.peek() != nums[i]) {
                stack.push(nums[i]);
                if (cursor != i) {
                    nums[cursor] = nums[i];
                }
                cursor++;
            }
        }
        return stack.size();
    }
}
