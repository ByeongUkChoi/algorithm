class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        char c;
        for (int i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.length() < i + 1 || c != str.charAt(i)) {
                    return answer.toString();
                }
            }
            answer.append(c);
        }
        return answer.toString();
    }
}