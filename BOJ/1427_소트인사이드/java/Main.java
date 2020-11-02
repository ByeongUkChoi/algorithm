
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length = (int)(Math.log10(n)+1);
        Integer[] nums = new Integer[length];
        for (int i = 0; i < length; i++) {
            int num = n % 10;
            n /= 10;
            nums[i] = num;
        }

        Arrays.sort(nums, Collections.reverseOrder());
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]);
        }
    }
}

