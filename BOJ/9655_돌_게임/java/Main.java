import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String winner;
        if (n % 2 != 0) {
            winner = "SK";
        } else {
            winner = "CY";
        }
        System.out.println(winner);
    }
}

