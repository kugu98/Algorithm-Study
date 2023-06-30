package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int M=Integer.parseInt(st.nextToken());
        
        int sort[]=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sort[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);
        int i=0;
        int j=N-1;
        int cnt=0;
        while(i<j){
            if(sort[i]+sort[j]==M){
                i++;
                j--;
                cnt++;
            }else if(sort[i]+sort[j]<M){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(cnt);
    }
}
