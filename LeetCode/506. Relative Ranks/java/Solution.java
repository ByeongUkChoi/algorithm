class Solution {
    public String[] findRelativeRanks(int[] score) {
        Integer[] sortedScores = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(sortedScores, Collections.reverseOrder());

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < sortedScores.length; i++) {
            indexMap.put(sortedScores[i], i);
        }

        Map<Integer, Integer> valueToIndexMap = new HashMap<>();
        for (int val : sortedScores) {
            valueToIndexMap.put(val, indexMap.get(val));
        }

        String[] answer = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int num = score[i];
            int v = valueToIndexMap.get(num);
            if (v == 0) {
                answer[i] = "Gold Medal";
            } else if (v == 1) {
                answer[i] = "Silver Medal";
            } else if (v == 2) {
                answer[i] = "Bronze Medal";
            } else {
                answer[i] = Integer.toString(v + 1);
            }
        }

        return answer;
    }
}