package Set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String readLine=br.readLine();

        HashSet<String> hashSet=new HashSet<>();


        for(int i=0;i<readLine.length();i++){
            for(int j=i+1;j<=readLine.length();j++){
                hashSet.add(readLine.substring(i,j));
            }
        }
        System.out.println(hashSet.size());
    }
}
