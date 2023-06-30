package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());

        int sp=1;
        int ep=1;
        int sum=1;
        int cnt=1;
        while (ep!=N){
            if(sum==N) {
                ep++;
                sum = sum + ep;
                cnt++;
            }else if(sum>N){
                sum=sum-sp;
                sp++;
            }else{
                ep++;
                sum=sum+ep;
            }
        }
        System.out.println("cnt = " + cnt);
    }
}
