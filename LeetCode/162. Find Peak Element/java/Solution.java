import java.util.stream.IntStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;

class Solution {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        if (length <= 2) {
            return IntStream.range(0, length)
                    .mapToObj(i -> new SimpleEntry<>(i, nums[i]))
                    .max(Comparator.comparing(SimpleEntry::getValue))
                    .map(SimpleEntry::getKey)
                    .orElseThrow();
        }
        int prev = nums[0];
        for (int i = 1; i < length - 1; i++) {
            int next = nums[i + 1];
            if (prev < nums[i] && nums[i] > next) {
                return i;
            }
        }
        return nums[0] >= nums[length - 1] ? 0 : length -1;
    }
}