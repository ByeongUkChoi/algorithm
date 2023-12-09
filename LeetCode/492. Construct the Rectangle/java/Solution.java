class Solution {
    public int[] constructRectangle(int area) {
        int[] answer = new int[2];
        answer[0] = area;
        answer[1] = 1;
        for (int i = area - 1; i >= 1; i--) {
            if (area % i == 0 && Math.abs(answer[0] - answer[1]) > Math.abs(i - area / i)) {
                answer[0] = i;
                answer[1] = area / i;
            }
        }
        return answer;
    }
}