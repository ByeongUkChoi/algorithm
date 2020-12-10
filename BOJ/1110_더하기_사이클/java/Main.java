import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int originN = n;
        int i;
        for (i = 1;; i++) {
            n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
            if (n == originN) {
                break;
            }
        }
        System.out.println(i);
    }
}

