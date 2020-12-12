import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = solution(scanner.nextInt());
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    /**
     * n을 1,2,3의 합을 구하는 방법의 수
     * @param n
     * @return
     */
    public static int solution(int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
            case 2:
                return n;
        }
        return solution(n - 1) + solution(n - 2) + solution(n - 3);
    }
}

