package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ24060 {
    static int[] A,sort;
    static int count = 0;
    static int K;
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());

        //두번째 라인
        st = new StringTokenizer(br.readLine());

        A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        sort=new int[N];
        merge_sort(A,0,N-1);
        System.out.println("result = " + result);

    }

    static void merge_sort(int A[],int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            merge_sort(A, left, mid);
            merge_sort(A, mid+1, right);
            merge(A,left,mid,right);

        }
    }
    static void merge(int A[],int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int t=0;

        while(i<=mid && j<=right){
            if(A[i]<=A[j]){
                sort[t++]=A[i++];
            }else{
                sort[t++]=A[j++];
            }
        }
        //한 쪽에 남아있는 배열 일괄 복사하기
        while(i<=mid){
            sort[t++]=A[i++];
        }
        while(j<=right){
            sort[t++]=A[j++];
        }

        //원하는값 뽑기
        t=0;
        i=left;

        while (i<=right){
            count++;
            if(count==K){
                result=sort[t];
                break;
            }
            A[i++]=sort[t++];
        }

    }
}
