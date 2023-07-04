package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sort[]=new int[N];
        int sort_sum[]=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sort[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);
        sort_sum[0]=sort[0];
        for(int i=1;i<N;i++){
            sort_sum[i]=sort_sum[i-1]+sort[i];
        }
        int total=0;
        for(int i=0;i<N;i++){
            total=total+sort_sum[i];
        }
        System.out.println(total);

    }
}
