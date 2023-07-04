package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ1377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Data[] sort=new Data[N];

        for(int i=0;i<N;i++){
            sort[i]=new Data(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(sort);
        int Max=0;
        for(int i=0;i<N;i++){
            if(Max < sort[i].index-i){
                Max=sort[i].index-i;
            }
        }
        System.out.println(Max+1);

    }
    //객체와 객체의 순서를 저장
    static class Data implements Comparable<Data>{
        int value;
        int index;

        public Data(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(Data o){
            return this.value-o.value;
        }
    }
}
