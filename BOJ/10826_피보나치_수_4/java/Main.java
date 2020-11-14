
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n);
            return;
        }

        BigInteger f1 = new BigInteger("0");
        BigInteger f2 = new BigInteger("1");
        BigInteger prevF2;

        for (int i = 2; i < n; i++) {
            prevF2 = f2;
            f2 = f2.add(f1);
            f1 = prevF2;
        }
        System.out.println(f1.add(f2));
    }
}

