import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int n = a * b * c;

        int[] result = new int[10];
        while(n > 0) {
            result[n % 10]++;
            n /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(result[i]);
        }
    }
}


