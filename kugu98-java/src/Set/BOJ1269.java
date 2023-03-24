package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        Map<Integer,Integer> A=new HashMap<>();
        StringTokenizer st=new StringTokenizer(br.readLine());

        List<Integer> AList=new ArrayList<>();
        List<Integer> BList=new ArrayList<>();

        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            A.put(num,0);
            AList.add(num);
        }

        Map<Integer, Integer> B = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            B.put(num,0);
            BList.add(num);
        }
        for (int num : AList) {
            if (B.containsKey(num)) B.remove(num);
        }
        for (int num : BList) {
            if (A.containsKey(num)) A.remove(num);
        }
        System.out.print(A.size() + B.size());



    }
}
