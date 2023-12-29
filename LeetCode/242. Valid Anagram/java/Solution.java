class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Long> sfrequencyMap = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Character, Long> tfrequencyMap = t.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return sfrequencyMap.equals(tfrequencyMap);
    }
}