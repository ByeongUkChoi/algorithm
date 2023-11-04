import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        final char REMOVED_SIGN = '-';
        for (int i = 0, start = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && isCorrectBracket(stack.peek(), chars[i])) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }
            if (start != i && stack.isEmpty()) {
                System.out.println("start");
                System.out.println(start);
                System.out.println("i-1");
                System.out.println(i - 1);
                chars[start] = REMOVED_SIGN;
                chars[i] = REMOVED_SIGN;
                start = i + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != REMOVED_SIGN) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isCorrectBracket(char a, char b) {
        return a == '(' && b == ')' || a == '[' && b == ']' || a == '{' && b == '}';
    }
}