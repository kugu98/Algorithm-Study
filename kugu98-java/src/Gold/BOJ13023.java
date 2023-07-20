package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13023 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    static boolean check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        A=new ArrayList[N];
        visited=new boolean[N];
        check=false;

        for(int i=0;i<N;i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);

        }
        for(int i=0;i<N;i++){
            DFS(i, 1);
            if(check){
                break;
            }
        }
        if(check){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
    public static void DFS(int now,int depth){
        if(depth==5||check){
            check=true;
            return;
        }
        visited[now]=true;
        for(int i:A[now]){
            if(!visited[i]){
                DFS(i,depth+1);
            }
        }
        visited[now]=false;
    }
}