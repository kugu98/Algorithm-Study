package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        String input=st.nextToken();
        int sort[]=new int[input.length()];

        for(int i=0;i<input.length();i++){
            sort[i]=Integer.parseInt(input.substring(i,i+1));
        }

        for(int i=0;i<input.length();i++){
            int Max=i;
            for(int j=i+1;j<input.length();j++){
                if(sort[j]>sort[Max]){
                    Max=j;
                }
            }
            if(sort[i]<sort[Max]){
                int temp=sort[i];
                sort[i]=sort[Max];
                sort[Max]=temp;
            }
        }
        for(int i=0;i<input.length();i++){
            System.out.print(sort[i]);
        }

    }
}
