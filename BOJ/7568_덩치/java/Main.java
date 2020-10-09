
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] s;
        int[][] input = new int[count][2];
        for (int i = 0; i < count; i++) {
            s = br.readLine().split(" ");
            input[i][0] = Integer.parseInt(s[0]);
            input[i][1] = Integer.parseInt(s[1]);
        }

        for (int i = 0; i < input.length; i++) {
            int rank = 1;
            for (int j = 0; j < input.length; j++) {
                if(i == j) {
                    continue;
                }
                if(input[i][0] < input[j][0] && input[i][1] < input[j][1]) {
                    rank++;
                }
            }
            System.out.print(new StringBuilder().append(rank).append(" ").toString());
        }
    }
}

