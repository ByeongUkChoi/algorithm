
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        scanner.close();

        System.out.println(solution(a, b, c));
    }

    /**
     * @param a 생산에 필요한 고정 비용
     * @param b 1대 생산 비용
     * @param c 판매 비용
     * @return
     */
    private static long solution(long a, long b, long c) {
        if (b >= c) {
            return -1;
        }
        return a / (c - b) + 1;
    }
}

