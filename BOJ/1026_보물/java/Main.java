
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        String[] s;
        scanner.nextLine();
        s = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        s = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i]*b[n - 1 - i];
        }

        System.out.println(sum);
    }
}

