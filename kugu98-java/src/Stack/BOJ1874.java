package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int A[]=new int[N];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack=new Stack<>();
        StringBuffer sb=new StringBuffer();
        int num=1;
        boolean result=true;
        for(int i=0;i<A.length;i++){
            int pn=A[i];
            if(pn>=num){
                while (pn>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else {
                int n=stack.pop();
                if(n>pn){
                    System.out.println("NO");
                    result=false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if (result) System.out.println(sb.toString());
    }
}
