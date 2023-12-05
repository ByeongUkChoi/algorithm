class Solution {
  public void moveZeroes(int[] nums) {
      int[] newNums = new int[nums.length];
      int i = 0;
      for (int num : nums) {
          if (num != 0) {
              newNums[i++] = num;
          }
      }
      for (i = 0; i < nums.length; i++) {
          nums[i] = newNums[i];
      }
  }
}