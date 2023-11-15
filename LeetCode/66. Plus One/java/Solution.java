import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger num = BigInteger.ZERO;
        for (int digit : digits) {
            num = num.multiply(BigInteger.valueOf(10)).add(BigInteger.valueOf(digit));
        }
        num = num.add(BigInteger.ONE);
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        int charLength = chars.length;
        int[] answer = new int[charLength];
        for (int i = 0; i < charLength; i++) {
            answer[i] = chars[i] - '0';
        }
        return answer;
    }
}