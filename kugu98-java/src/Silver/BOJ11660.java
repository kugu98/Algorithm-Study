package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int Matrix[][]=new int[N+1][N+1];
        for(int i=1;i<N+1;i++){
            Matrix[0][i]=Matrix[i][0]=0;
        }
        for(int i=1;i<N+1;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=1;j<N+1;j++){
                Matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int MatrixSum[][]=new int [N+1][N+1];
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                MatrixSum[i][j]=MatrixSum[i][j-1]+MatrixSum[i-1][j]-MatrixSum[i-1][j-1]+Matrix[i][j];
            }
        }


        for(int i=0;i<M;i++){
            st=new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(MatrixSum[x2][y2]-MatrixSum[x1-1][y2]-MatrixSum[x2][y1-1]+MatrixSum[x1-1][y1-1]);
        }
    }
}
