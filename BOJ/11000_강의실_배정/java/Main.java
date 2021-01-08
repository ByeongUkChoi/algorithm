import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] times = new int[n][2];
        // 배열에 담기
        String[] s;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            times[i][0] = Integer.parseInt(s[0]);
            times[i][1] = Integer.parseInt(s[1]);
        }
        // 정렬
        Arrays.sort(times, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        // 강의 시간을 담을 우선 순위 큐
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int result = 0;
        // 구하기
        for (int i = 0; i < n; i++) {
            if(priorityQueue.size() > 0 && priorityQueue.peek() <= times[i][0]) {
                priorityQueue.remove();
            }
            priorityQueue.add(times[i][1]);
            if (result < priorityQueue.size()) {
                result = priorityQueue.size();
            }
        }
        System.out.println(result);
    }
}

