
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] startStar = new String[]{"***", "* *", "***"};
        String[] star;
        star = makeStar(startStar, n);
        for (int i = 0; i < n; i++) {
            System.out.println(star[i]);
        }
    }
    public static String[] makeStar(String[] prevStar, int finalSize) {
        int prevStarSize = prevStar.length;
        if (prevStarSize == finalSize) {
            return prevStar;
        }
        String[] nextStar = new String[prevStarSize * 3];
        int nextSize = prevStarSize * 3;
        for (int i = 0; i < nextSize; i++) {
            if ((i >= nextSize / 3 && i < (nextSize / 3) * 2)) {
                //nextStar[i] += " ".repeat(3) + prevStar[i & prevStarSize];
                nextStar[i] = prevStar[i % prevStarSize] + String.join("", Collections.nCopies(prevStarSize, " ")) + prevStar[i % prevStarSize];
            } else {
                nextStar[i] = prevStar[i % prevStarSize] + prevStar[i % prevStarSize] + prevStar[i % prevStarSize];
            }
        }
        if (nextSize == finalSize) {
            return nextStar;
        }
        return makeStar(nextStar, finalSize);
    }
}
