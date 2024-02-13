import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo2850 {

    static int arr[];
    static int a;
    static int b;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         a = Integer.parseInt(st.nextToken());
          b= Integer.parseInt(st.nextToken());

          arr = new int[a];

          st = new StringTokenizer(br.readLine());

        for(int i=0; i< a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(check());

    }

    static int check(){


        int lo = 0;
        int hi = Integer.MAX_VALUE;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;
            long total = 0;

            for (int i = 0; i < a; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }

            if (total >= b) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi;
    }
}
/*
  가장 큰 값이 hi 이다 계속 유지되기 때문이다.
 */


