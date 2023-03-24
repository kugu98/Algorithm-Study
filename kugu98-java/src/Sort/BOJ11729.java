package Sort;

import java.io.*;

public class BOJ11729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((int) (Math.pow(2, N) - 1)));
        bw.newLine();

        Hanoi(N, 1, 2, 3, bw);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void Hanoi(int N, int start, int mid, int to, BufferedWriter bw) throws IOException {
        if (N == 1) {
            bw.write(start + " " + to);
            bw.newLine();
            return;
        }
        Hanoi(N - 1, start, to, mid, bw);

        bw.write(start + " " + to);
        bw.newLine();

        Hanoi(N - 1, mid, start, to, bw);
    }
}

