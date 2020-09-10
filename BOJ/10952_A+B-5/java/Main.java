import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int a, b;
        List<Integer> results = new ArrayList<>();
        for (int i = 0;; i++) {
            input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            if(a == 0 && b == 0) {
                break;
            }
            results.add(a + b);
        }
        //results.stream().forEach((result) -> System.out.println(result));
        results.forEach((result) -> System.out.println(result));
    }
}

