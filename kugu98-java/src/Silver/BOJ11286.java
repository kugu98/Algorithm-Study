package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue=new PriorityQueue<>((on1,on2)-> {
            int first = Math.abs(on1);
            int second = Math.abs(on2);

            if(first==second){
                return on1>on2? 1:-1;
            }else {
                return first-second;
            }
        });
        for(int i=0;i<N;i++){
            int request=Integer.parseInt(br.readLine());
            if(request==0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(request);
            }
        }
    }
}
