class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int productWithOutZero = 1;
        int zeroCount = 0;
        for (int num : nums) {
            product *= num;
            if (num != 0) {
                productWithOutZero *= num;
            } else {
                zeroCount++;
            }
        }
        int length = nums.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (zeroCount == 0) {
                answer[i] = product / num;
            } else {
                if (num == 0 && zeroCount == 1) {
                    answer[i] = productWithOutZero;
                } else {
                    answer[i] = 0;
                }
            }
        }
        return answer;
    }
}