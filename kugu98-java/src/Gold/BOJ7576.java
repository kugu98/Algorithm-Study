package Gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ7576 {
    static int[][] box;
    static int[][] day;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        box = new int[n][m];
        day = new int[n][m];

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    day[i][j] = 0;
                } else {
                    day[i][j] = -1;
                }
            }
        }

        bfs(queue);

        int maxDay = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] != -1 && day[i][j] > maxDay) {
                    maxDay = day[i][j];
                }
            }
        }


        if (checkTomato()) {
            System.out.println(-1);
        } else {
            System.out.println(maxDay);
        }
    }

    static void bfs(Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];


                if (nx < 0 || nx >= n || ny < 0 || ny >= m || box[nx][ny] == -1 || day[nx][ny] >= 0) {
                    continue;
                }

                queue.add(new int[]{nx, ny});
                day[nx][ny] = day[x][y] + 1;
            }
        }
    }

    static boolean checkTomato() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0 && day[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }
}
