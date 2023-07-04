package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int sort[]=new int[N];
        for(int i=0;i<N;i++){
            sort[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1-i;j++){
                if(sort[j]>sort[j+1]){
                    int temp=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(sort[i]);
        }


    }
}
