package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N=Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        int sum = 0;

        for (int o : stack) {
            sum += o;
        }
        System.out.println(sum);


    }
}
