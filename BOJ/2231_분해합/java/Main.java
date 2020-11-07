
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 10) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        for (int i = 10; i < n; i++) {
            int[] digits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).toArray();
            sum = i;
            for (int j = 0; j < digits.length; j++) {
                sum += digits[j];
            }
            if (sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}

