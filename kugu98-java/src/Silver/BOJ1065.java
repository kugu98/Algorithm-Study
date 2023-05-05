package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 99;

        if (N < 100) {
            System.out.println(N);
        } else {
            for (int i = 100; i <= N; i++) {
                if (i / 100 - (i / 10) % 10 == (i / 10) % 10 - i % 10) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        br.close();
    }
}
