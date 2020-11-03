
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nm = scanner.nextLine().split(" ");

        int n =  Integer.parseInt(nm[0]);
        int m =  Integer.parseInt(nm[1]);

        int[] card = new int[m];
        String[] cardValue = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(cardValue[i]);
        }

        int max = 0;
        int tmpSum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    tmpSum = card[i] + card[j] + card[k];
                    if (tmpSum <= m && tmpSum > max) {
                        max = tmpSum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}

