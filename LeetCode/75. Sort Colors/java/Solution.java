class Solution {
    PriorityQueue<Integer> minHeap;

    public void sortColors(int[] nums) {
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
        }
        int i = 0;
        while (!minHeap.isEmpty()) {
            nums[i++] = minHeap.remove();
        }
    }
}
