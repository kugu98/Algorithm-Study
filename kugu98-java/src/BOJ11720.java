import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        String T= st.nextToken();
        char NT []=T.toCharArray();
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=NT[i]-'0';
        }
        System.out.println(sum);
    }
}
