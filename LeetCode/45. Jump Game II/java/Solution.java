class Solution {
    public int jump(int[] nums) {
        int step = 0;
        int prevStepMaxReach = 0;
        int currentStepMaxReach = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentStepMaxReach = Math.max(currentStepMaxReach, i + nums[i]);
            if (i == prevStepMaxReach) {
                prevStepMaxReach = currentStepMaxReach;
                step++;
            }
        }
        return step;
    }
}
