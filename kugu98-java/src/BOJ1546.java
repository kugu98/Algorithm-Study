import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 찾기
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 점수 조작 및 총합 계산
        double sum = 0;
        for (int i = 0; i < N; i++) {
            double adjustedScore = (double) scores[i] / maxScore * 100;
            sum += adjustedScore;
        }

        // 평균 계산
        double average = sum / N;

        System.out.println(average);
    }
}
