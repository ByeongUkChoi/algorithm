
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int result;
        for (int i = 666;; i++) {
            if (Integer.toString(i).contains("666")) {
                count++;
                if (count == n) {
                    result = i;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

