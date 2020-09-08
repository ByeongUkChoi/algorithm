import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /**
     * 1  0
     * 0  1
     * 1  1
     * 1  2
     * 2  3
     * 3  5
     * 5  8
     * 8  13
     * 13 21
     * 21 34
     */
    public static void main(String[] args) throws IOException {

        // 피보나치 수열 배열 만듬 인풋이 40이하이다
        int[] fibonacciArr = new int[41];
        for (int i = 0; i <= 40; i++) {
            if(i <= 1) {
                fibonacciArr[i] = i;
            } else {
                fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(br.readLine());
            result[i] = n;
        }
        for (int i = 0; i < count; i++) {
            if (result[i] == 0) {
                System.out.println("1 0");
            } else if (result[i] == 1) {
                System.out.println("0 1");
            } else {
                System.out.println(fibonacciArr[result[i] - 1] + " " + fibonacciArr[result[i]]);
            }
        }
    }
}

