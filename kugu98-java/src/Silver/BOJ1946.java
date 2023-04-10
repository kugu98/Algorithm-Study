package Silver;

import java.io.*;
import java.util.*;

public class BOJ1946 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] rank = new int[n + 1];
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                rank[a] = b;
            }

            int ans = 1;
            int min = rank[1];
            for (int j = 2; j <= n; j++) {
                if (rank[j] < min) {
                    ans++;
                    min = rank[j];
                }
            }
            System.out.println(ans);
        }
    }
}

