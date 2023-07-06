package Silver;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ2751 {
    public static int A[];
    public static int[] tmp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N=Integer.parseInt(br.readLine());
        A=new int[N];
        tmp=new int [N];

        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        merge(0,N-1);
        for(int i=0;i<N;i++){
            bw.write(A[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static void merge(int s,int e){
        if(e-s<1){
            return;
        }
        int m=s+(e-s)/2;

        merge(s,m);
        merge(m+1,e);
        for(int i=s;i<=e;i++){
            tmp[i]=A[i];
        }
        int k=s;
        int index1=s;
        int index2=m+1;
        while(index1<=m &&index2<=e){
            if(tmp[index1]>tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2++;
            }else{
                A[k]=tmp[index1];
                k++;
                index1++;
            }
        }
        while (index1<=m){
            A[k]=tmp[index1];
            k++;
            index1++;
        }
        while (index2<=e){
            A[k]=tmp[index2];
            k++;
            index2++;
        }


    }

}
