import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] s;

        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            s = br.readLine().split(" ");
            results.add(Integer.parseInt(s[0]) + Integer.parseInt(s[1]));
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Case #%d: %d\n", i + 1, results.get(i));
        }
    }
}
