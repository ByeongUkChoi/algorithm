import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 2) {
            System.out.println(1);
            return;
        }

        BigInteger[] fibonacci = new BigInteger[n+1];
        fibonacci[1] = BigInteger.valueOf(1);
        fibonacci[2] = BigInteger.valueOf(1);

        for (int i = 3; i <= n; i++) {
            fibonacci[i] = fibonacci[i-1].add(fibonacci[i-2]);
        }

        System.out.println(fibonacci[n]);
    }
}
