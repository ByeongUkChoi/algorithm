class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        int length = 2 * n;
        int[] brackets;
        for (int i = 0; i < Math.pow(2, length); i++) {
            brackets = makeBracket(i, length);
            if (isValid(brackets)) {
                String bracketStr = bracketToString(brackets);
                answer.add(bracketStr);
            }
        }
        return answer;
    }

    private int[] makeBracket(int i, int length) {
        int[] brackets = new int[length];
        Arrays.fill(brackets, 1);
        char[] chars = Integer.toBinaryString(i).toCharArray();
        int charLength = chars.length;
        for (int j = 0; j < charLength; j++) {
            brackets[length - charLength + j] = chars[j] == '0' ? 1 : -1;
        }
        return brackets;
    }

    private String bracketToString(int[] brackets) {
        StringBuilder sb = new StringBuilder();
        for (int b : brackets) {
            sb.append(b == 1 ? "(" : ")");
        }
        return sb.toString();
    }

    private boolean isValid(int[] brackets) {
        int sum = 0;
        for (int i : brackets) {
            if (sum < 0) {
                return false;
            }
            sum += i;
        }
        return sum == 0;
    }
}