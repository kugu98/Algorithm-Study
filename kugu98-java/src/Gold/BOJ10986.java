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
        int S[]=new int[N];
        int C[]=new int[M];
        int answer=0;
        st=new StringTokenizer(br.readLine());
        S[0]=Integer.parseInt(st.nextToken());
        for(int i=1;i<N;i++){
            S[i]=S[i-1]+Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N;i++){
            int re=S[i]%M;
            if(re==0){
                answer++;
            }
            C[re]++;
        }
        for(int i=0;i<M;i++){
            if(C[i]>1){
                answer=answer+(C[i]*(C[i]-1)/2);
            }
        }
        System.out.println(answer);

    }
}
