import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] times = new int[count];
        for (int i = 0; i < count; i++) {
            times[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(times);
        int result = 0;
        for (int i = 0; i < count; i++) {
            result += (count - i) * times[i];
        }
        System.out.print(result);
    }
}

