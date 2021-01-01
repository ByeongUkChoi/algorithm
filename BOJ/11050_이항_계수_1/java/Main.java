import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int min = n - k < k ? n - k : k;
        int result = (int)(multipleDecreasing(n, min) / fact(min));
        System.out.println(result);
    }
    public static long multipleDecreasing(int n, int count) {
        long result = 1;
        for (int i = 0; i < count; i++) {
            result *= n - i;
        }
        return result;
    }
    public static long fact(int n) {
        if (n > 1)
            return fact(n - 1) * n;
        else
            return 1;
    }
}