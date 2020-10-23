
public class Main {
    public static void main(String[] args) {
        int[] num = new int[10000];
        for (int i = 1; i < 10000; i++) {
            int d = d(i);
            if (d < 10000) {
                num[d] = 1;
            }
        }
        for (int i = 1; i < 10000; i++) {
            if (num[i] == 0) {
                System.out.println(i);
            }
        }
    }
    public static int d(int n) {
        int result = n;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}

