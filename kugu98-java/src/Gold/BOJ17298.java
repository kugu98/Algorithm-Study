package Gold;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int arr[]=new int[N];
        int ans[]=new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(int i=1;i<N;i++){
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                ans[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            ans[stack.pop()]=-1;
        }
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<N;i++){
            bw.write(ans[i]+" ");
        }
        bw.write('\n');
        bw.flush();
    }
}
