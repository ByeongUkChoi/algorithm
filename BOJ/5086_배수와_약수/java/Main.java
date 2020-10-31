
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        ArrayList<String> result = new ArrayList<>();
        while (true) {
            String[] s = scanner.nextLine().split(" ");
            n = Integer.parseInt(s[0]);
            m = Integer.parseInt(s[1]);
            if (m == 0 && n == 0) {
                break;
            }
            if(m % n == 0) {
                result.add("factor");
            } else if (n % m == 0){
                result.add("multiple");
            } else {
                result.add("neither");
            }
        }
        for (String r: result) {
            System.out.println(r);
        }
    }
}
