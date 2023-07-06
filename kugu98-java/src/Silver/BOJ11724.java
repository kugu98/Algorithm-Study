package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11724 {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        A=new ArrayList[N+1];
        visited=new boolean[N+1];

        for(int i=1;i<N+1;i++){
            A[i]=new ArrayList<>();
        }
        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count=0;
        for(int i=1;i<=N;i++)
        {
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v]=true;
        for(int i:A[v]){
            if(visited[i]==false){
                DFS(i);
            }
        }
    }
}
