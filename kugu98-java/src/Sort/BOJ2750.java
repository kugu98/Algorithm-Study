package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int line=Integer.parseInt(st.nextToken());
        int sort[]=new int[line];
        for(int i=0;i<line;i++){
            st=new StringTokenizer(br.readLine());
            sort[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sort);

        for(int i=0;i<line;i++){
            System.out.println((sort[i]));
        }

    }

}
