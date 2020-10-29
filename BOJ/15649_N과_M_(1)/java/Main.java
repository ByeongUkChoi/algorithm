
import java.util.Scanner;

public class Main {
    public static int n, m;
    private static final int MAX = 8;
    public static int[] list = new int[MAX + 1];
    public static boolean[] check = new boolean[MAX + 1];

    public static void dfs(int count) {
        // m개 만큼 차면 출력 (재귀 종료)
        if (count == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println();
            return;
        }
        // 1 ~ n 중에 순서대로 그리고 중복 없이 list에 담기
        for (int i = 1; i <= n; i++) {
            // 중복 값은 넣지 않기 위해
            if(!check[i]) {
                // 해당 값 넣기
                list[count] = i;
                // 이 값은 list에 넣으니 중복 체크
                check[i] = true;
                // 다음 값을 채우기 위해 재귀 (m개 만큼 다 차면 재귀 종료됨)
                dfs(count + 1);
                // 다음 출력을 위해 중복 값 제거(초기화)
                check[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        dfs(0);
    }
}

