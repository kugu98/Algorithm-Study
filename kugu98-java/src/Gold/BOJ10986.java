package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int S[]=new int[N+1];
        int answer=0;

        for(int i=1;i<N+1;i++){
            S[i]=S[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N+1; i++) {
            for(int j=i; j<N+1; j++) {
                if((S[j] - S[i-1]) % M == 0) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
