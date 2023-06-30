package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int sort[]=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sort[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);
        int cnt=0;
        for (int k=0;k<N;k++){
            int find=sort[k];
            int i=0;
            int j=N-1;
            while (i<j){
                if(sort[i]+sort[j]<find){
                    i++;
                }else if(sort[i]+sort[j]>find){
                    j--;
                }else if (sort[i]+sort[j]==find){
                    if(i!=k &&j!=k){
                        cnt++;
                        break;
                    }else if(i==k){
                        i++;
                    }else if(j==k){
                        j--;
                    }
                }
            }
        }
        System.out.println(cnt);

    }
}
