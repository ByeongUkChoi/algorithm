import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s;

        s = scanner.nextLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int l = Integer.parseInt(s[1]);

        s = scanner.nextLine().split(" ");
        int[] points = new int[n];
        for (int i = 0; i < s.length; i++) {
            points[i] = Integer.parseInt(s[i]);
        }

        int result = solution(l, points);
        System.out.println(result);
    }

    /**
     * 물이 새는 지점 0.5 전부터 테이프를 붙여야 할때 테이프의 최소 필요 개수
     * @param l         테이프 길이
     * @param points    물이 새는 지점
     * @return          최소 테이프 필요 개수
     */
    public static int solution(int l, int[] points) {
        Arrays.sort(points);

        int result = 0;
        float startTapedPoint = 0;
        boolean isTaped = false;
        for (int point : points) {
            if(isTaped && startTapedPoint + (float)l > point) {
                continue;
            }
            startTapedPoint = (float) (point - 0.5);
            isTaped = true;
            result++;
        }
        return result;
    }
}

