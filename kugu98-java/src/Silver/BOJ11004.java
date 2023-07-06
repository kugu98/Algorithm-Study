package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        int quick[]=new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            quick[i]=Integer.parseInt(st.nextToken());
        }

    }
    /*public static int partition(int []A,int S,int E){

    }*/
    public static void swap(int [] A,int i, int j){
        int temp=A[i];
        A[i]=A[j];
        A[j]=temp;
    }
}
