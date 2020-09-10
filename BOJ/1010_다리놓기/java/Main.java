
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        // 선끼리 겹치면 안된다
        // M개 중 N개를 고르고 순서는 상관하지 않는다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long[] result = new long[count];
        int n, m;
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
            int min = m - n < n ? m - n : n;
            result[i] = multipleDecreasing(m, min).divide(BigInteger.valueOf(fact(min))).longValue();
        }
        for (int i = 0; i < count; i++) {
            System.out.println(result[i]);
        }
    }
    public static BigInteger multipleDecreasing(int n, int count) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 0; i < count; i++) {
            result = result.multiply(BigInteger.valueOf(n - i));
        }
        return result;
    }
    public static long fact(int n) {
        if (n > 1)
            return fact(n - 1) * n;
        else
            return 1;
    }
}
