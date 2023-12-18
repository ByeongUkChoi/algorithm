class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = IntStream.range(0, numbers.length)
                .boxed()
                .collect(Collectors.toMap(i -> numbers[i], i -> i, (a, b) -> b));

        Set<Integer> keySet = map.keySet();
        int a = 0, b = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = target - numbers[i];
            if (keySet.contains(sum)) {
                a = i + 1;
                b = map.get(sum) + 1;
                break;
            }
        }
        return new int[]{a, b};
    }
}