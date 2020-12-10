import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        BigInteger total = new BigInteger(input[1]);

        BigInteger[] coins = new BigInteger[count];
        for (int i = 0; i < count; i++) {
            coins[i] = new BigInteger(br.readLine());
        }

        int result = 0;
        BigInteger left;
        BigInteger sum = new BigInteger("0");
        BigInteger divide;
        for (int i = count - 1; i >= 0; i--) {
            left = total.subtract(sum);
            // left < coins[i]
            if (left.compareTo(coins[i]) != -1) {
                divide = left.divide(coins[i]);
                sum = sum.add(coins[i].multiply(divide));
                result = result + divide.intValue();
            }
        }
        System.out.print(result);
    }
}

