import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algo2850 {

    static int arr[];
    static int a;
    static int b;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);

        int left = 1;
        int right = trees[N-1];
        int result = 0;

        while(left <= right) {
            int mid = (left + right) / 2;
            long sum = 0;

            for (int i = 0; i < N; i++) {
                if (trees[i] >= mid)
                    sum += trees[i] - mid;
            }

            if (sum >= M) {
                result = mid;

                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}
/*
   자료형의 범위를 잘 생각해야 한다
   입력된 나무들의 길이를 정렬하고
   시작이 제일 짧은 나무와 긴 나무의 중간값으로 절단 높이를 정한다
   모든 나무를 탐색하며 절단 높이에서 잘리는 나무의 길이를 계산한다
   총합이 너무 크면 많이 자른것이고 낮으면 덜 잘랐다는 뜻이다.
   참고 : https://eijun.tistory.com/276
 */


