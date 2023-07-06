package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2023 {
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7,1);


    }
    static void DFS(int num,int n){
        if(n==N){
            if(Even(num)){
                System.out.println(num);
            }
            return;
        }
        for(int i=1;i<10;i++){
            if(i%2==0){
                continue;
            }
            if(Even(num*10+i)){
               DFS(num*10+i,n+1);
            }
        }

    }
    static boolean Even(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
