
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> card = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            card.add(i);
        }
        while (card.size() > 1) {
            card.remove(0);
            card.add(card.get(0));
            card.remove(0);
        }
        System.out.println(card.get(0));
    }
}

