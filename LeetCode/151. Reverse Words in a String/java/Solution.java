class Solution {
    public String reverseWords(String s) {
        List<String> words = Arrays.stream(s.trim().split("\\s+")).collect(Collectors.toList());
        Collections.reverse(words);
        return String.join(" ", words);
    }
}