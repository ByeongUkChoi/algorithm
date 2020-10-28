
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] x = new int[n][m];

        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] s = scanner.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                x[i][j] = Integer.parseInt(s[j]);
            }
        }

        int n2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int[][] y = new int[n2][m2];

        scanner.nextLine();

        for (int i = 0; i < n2; i++) {
            String[] s = scanner.nextLine().split(" ");
            for (int j = 0; j < m2; j++) {
                y[i][j] = Integer.parseInt(s[j]);
            }
        }

        int[][] result = new int[n][m2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < m; k++) {
                    result[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        // print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

