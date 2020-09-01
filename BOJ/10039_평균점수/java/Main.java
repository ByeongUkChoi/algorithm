import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 5;
        int totalScore = 0;
        // 5명의 점수를 입력을 받는다

        Scanner put = new Scanner(System.in);
        int score;
        for(int i=0; i<count; i++){
            // 모두 더한다 (단, 40점 미만은 40점으로 계산한다)
            score = Integer.parseInt(put.next());
            if(score < 40) {
                score = 40;
            }
            totalScore += score;
        }
        // 평균 값을 구한다
        int averageScore = totalScore/count;
        System.out.println(averageScore);
        return;
    }
}