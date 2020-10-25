
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] result = new int[count];
        String[] exp;
        for (int i = 0; i < count; i++) {
            exp = br.readLine().split(" ");
            result[i] = Integer.parseInt(exp[0]) + Integer.parseInt(exp[1]);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

