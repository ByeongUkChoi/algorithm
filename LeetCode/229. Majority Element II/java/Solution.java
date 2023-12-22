class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int min = nums.length / 3;

        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > min)
                .map(Map.Entry::getKey)
                .toList();
    }
}