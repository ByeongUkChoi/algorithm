
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[][] times = new int[count][2];
        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            times[i][0] = Integer.parseInt(input[0]);
            times[i][1] = Integer.parseInt(input[1]);
        }

        // 1번째 인덱스로 오름차순 정렬 (같은 값일 경우 0번째 인덱스로 오름차순 정렬)
        Arrays.sort(times, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int result = 0;
        int lastEndTime = 0;
        for (int[] time: times) {
            if (time[0] >= lastEndTime) {
                lastEndTime = time[1];
                result++;
            }
        }

        System.out.print(result);
    }
}
