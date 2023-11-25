class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int val = map.getOrDefault(num, 0);
            int newVal = val + 1;
            if (newVal % 2 == 0) {
                map.remove(num);
            } else {
                map.put(num, newVal);
            }
        }
        return (int) map.keySet().toArray()[0];
    }
}