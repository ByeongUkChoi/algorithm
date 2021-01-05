import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int[] inputs = new int[k];
        for (int i = 0; i < k; i++) {
            inputs[i] = scanner.nextInt();
        }
        BigInteger[] koong = solution();
        for (int i = 0; i < k; i++) {
            System.out.println(koong[inputs[i]]);
        }
    }
    public static BigInteger[] solution() {
        BigInteger[] koong = new BigInteger[68];
        koong[0] = BigInteger.ONE;
        koong[1] = BigInteger.ONE;
        koong[2] = BigInteger.valueOf(2);
        koong[3] = BigInteger.valueOf(4);
        for (int i = 4; i <= 67; i++) {
            koong[i] = koong[i-1].add(koong[i-2]).add(koong[i-3]).add(koong[i-4]);
        }

        return koong;
    }
}

