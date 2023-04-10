import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int A []=new int[N];
        int B []=new int[N];
        int sum=0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        //A 배열 값 대입
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        st=new StringTokenizer(br.readLine());
        //B 배열 값 대입
        for(int i=0;i<N;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<Integer>();

        int minIndex; // 최소값의 인덱스를 저장할 변수

        // 배열의 모든 원소를 순회하면서, 가장 작은 값부터 스택에 push
        for (int i = 0; i < B.length; i++) {
            minIndex = i; // 최소값의 인덱스로 초기화

            // i번째 원소보다 작은 값들 중에서 가장 작은 값을 찾음
            for (int j = i + 1; j < B.length; j++) {
                if (B[j] < B[minIndex]) {
                    minIndex = j;
                }
            }

            // 최소값의 인덱스에 있는 원소를 i번째 원소와 교환
            int temp = B[i];
            B[i] = B[minIndex];
            B[minIndex] = temp;

            // 스택에 push
            stack.push(B[i]);
        }

        for (int i=0;i<N;i++){
            sum=sum+(A[i]*stack.pop());
        }
        System.out.println(sum);

    }


}

