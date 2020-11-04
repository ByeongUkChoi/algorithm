
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int step;
        int sum = 0;
        for (step = 1; sum < n; step++) {
            sum += step;
        }
        step--;

        int diff = sum - n;
        int a, b;
        a = step - diff;
        b = diff + 1;

        // even
        if (step % 2 == 0) {
            System.out.printf("%d/%d", a, b);
        } else {    // odd
            System.out.printf("%d/%d", b, a);
        }
    }
}

