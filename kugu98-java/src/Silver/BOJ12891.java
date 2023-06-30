package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891 {
    static int checkARR[];
    static int myARR[];
    static int checkSecret;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S=Integer.parseInt(st.nextToken());
        int P=Integer.parseInt(st.nextToken());

        int result=0;
        char DNA []=new char[S];
        DNA=br.readLine().toCharArray();
        checkARR=new int[4];
        myARR=new int[4];
        checkSecret=0;

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            checkARR[i]=Integer.parseInt(st.nextToken());
        }
    }
}
