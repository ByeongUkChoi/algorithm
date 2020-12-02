
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        String[] s;
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("0 0 0")) {
                break;
            }
            s = input.split(" ");
            result.add(solution(Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])));
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.printf("Case %d: %d\n", i + 1, result.get(i));
        }
    }

    /**
     *
     * @param l 연속 일 중 사용 가능일
     * @param p 연속 일
     * @param v 총 휴가
     * @return
     */
    public static int solution(int l, int p, int v) {
        int result = (v / p) * l;
        result += v % p >= l ? l : v % p;
        return result;
    }
}

