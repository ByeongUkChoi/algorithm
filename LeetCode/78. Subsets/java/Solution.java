class Solution {
    private Set<List<Integer>> answer;

    public List<List<Integer>> subsets(int[] nums) {
        answer = new HashSet<>();
        answer.add(new ArrayList<>());
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            Set<List<Integer>> set = new HashSet<>();
            for (List<Integer> elem : answer) {
                List<Integer> newList = new ArrayList<>(elem);
                newList.add(nums[i]);
                set.add(newList);
            }
            answer.addAll(set);
            List<Integer> aloneList = new ArrayList<>();
            aloneList.add(nums[i]);
            answer.add(aloneList);
        }
        return List.copyOf(answer);
    }
}