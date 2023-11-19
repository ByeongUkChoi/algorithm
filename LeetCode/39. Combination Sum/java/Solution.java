class Solution {
    Set<List<Integer>> answer;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        answer = new HashSet<>();
        combine(candidates, target, new ArrayList<>());
        return answer.stream().toList();
    }

    private void combine(int[] candidates, int target, List<Integer> acc) {
        if (target == 0) {
            Collections.sort(acc);
            answer.add(acc);
            return;
        }
        for (int candidate : candidates) {
            if (target - candidate < 0) {
                continue;
            }
            List<Integer> newAcc = new ArrayList<>(acc);
            newAcc.add(candidate);
            combine(candidates, target - candidate, newAcc);
        }
    }
}