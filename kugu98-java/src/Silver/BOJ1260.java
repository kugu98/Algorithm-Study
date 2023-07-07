package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1260 {
    static boolean visited[];
    static ArrayList<Integer> A[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        A = new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            A[i] = new ArrayList<>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
            A[E].add(S);
        }
        for(int i=1;i<=N;i++){
            Collections.sort(A[i]);
        }
        visited = new boolean[N + 1];
        DFS(V);
        System.out.println();
        visited = new boolean[N + 1];
        BFS(V);
        System.out.println();

    }
    public static void DFS(int Node){
        System.out.print(Node+" ");
        visited[Node]=true;
        for(int i:A[Node]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
    private static void BFS(int Node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(Node);
        visited[Node]=true;

        while(!queue.isEmpty()){
            int poll_node = queue.poll();
            System.out.print(poll_node+" ");
            for(int i: A[poll_node]){
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
}
