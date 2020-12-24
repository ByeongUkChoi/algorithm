import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[] inputs = new int[t];
        int max = 0;
        for (int i = 0; i < t; i++) {
            inputs[i] = scanner.nextInt();
            if (max < inputs[i]) {
                max = inputs[i];
            }
        }

        BigInteger[] fibonacci = solution(max);

        for (int i = 0; i < t; i++) {
            System.out.println(fibonacci[inputs[i]]);
        }
    }
    public static BigInteger[] solution(int n) {

        if (n <= 3) {
            BigInteger[] fibonacci = new BigInteger[4];
            fibonacci[1] = BigInteger.valueOf(1);
            fibonacci[2] = BigInteger.valueOf(1);
            fibonacci[3] = BigInteger.valueOf(1);
            return fibonacci;
        }

        BigInteger[] fibonacci = new BigInteger[n+1];
        fibonacci[1] = BigInteger.valueOf(1);
        fibonacci[2] = BigInteger.valueOf(1);
        fibonacci[3] = BigInteger.valueOf(1);

        for (int i = 4; i <= n; i++) {
            fibonacci[i] = fibonacci[i-2].add(fibonacci[i-3]);
        }
        return fibonacci;
    }
}
