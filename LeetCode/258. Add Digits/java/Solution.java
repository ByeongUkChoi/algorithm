class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = Arrays.stream(toDigits(num)).sum();
        return addDigits(sum);
    }

    private int[] toDigits(int number) {
        String numberStr = Integer.toString(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }
}