
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] visited = new int[101];
    public static int[][] computer = new int[101][101];
    public static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerCount = Integer.parseInt(br.readLine());
        int nodeCount = Integer.parseInt(br.readLine());
        for (int i = 1; i <= nodeCount; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");
            int computerNumA = Integer.parseInt(s1[0]);
            int computerNumB = Integer.parseInt(s1[1]);
            computer[computerNumA][computerNumB] = 1;
            computer[computerNumB][computerNumA] = 1;
        }
        dfs(1, computerCount);
        System.out.println(result - 1);
    }
    public static void dfs(int start, int nodeCount) {
        visited[start] = 1;
        result++;
        for (int i = 1; i <= nodeCount; i++) {
            if(computer[start][i] == 1 && visited[i] == 0) {
                dfs(i, nodeCount);
            }
        }
    }
}

