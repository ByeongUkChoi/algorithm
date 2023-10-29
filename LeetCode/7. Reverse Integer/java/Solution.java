import java.math.BigInteger;

class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        int abs_x = abs(x);
        StringBuilder stringBuilder = new StringBuilder(Integer.toString(abs_x));
        int result = convertToIntOrZero(stringBuilder.reverse().toString());
        if (isNegative) {
            result *= -1;
        }
        return result;
    }

    public int abs(int x) {
        if (x <= Integer.MIN_VALUE) {
            return 0; // 또는 특정 다른 로직에 따라 처리
        } else {
            return Math.abs(x);
        }
    }

    public int convertToIntOrZero(String str) {
        BigInteger bigInt = new BigInteger(str);
        BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger minInt = BigInteger.valueOf(Integer.MIN_VALUE);

        if (bigInt.compareTo(maxInt) <= 0 && bigInt.compareTo(minInt) >= 0) {
            return bigInt.intValue();
        } else {
            return 0;
        }
    }
}
