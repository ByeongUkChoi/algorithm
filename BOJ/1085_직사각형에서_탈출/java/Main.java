
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int[] length = {x, y, w - x, h - y};
        int min = length[0];

        for(int i=0;i<length.length;i++) {
            if(min>length[i]) {
                min = length[i];
            }
        }
        System.out.print(min);
    }
}

