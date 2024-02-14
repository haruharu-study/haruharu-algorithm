import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


public class Algo16564 {

    static int a;
    static int b;

    static int arr[];


        public static void main (String[]args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken()); // 배열의 개수
            b = Integer.parseInt(st.nextToken()); // 올릴 수 있는 레벨의 총합

            arr = new int[a];

            for (int i = 0; i < a; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            int result = 0;
            int lo = 1;
            int hi = arr[a - 1]; // 수정된 부분

            while (lo <= hi) {

                int middle = (lo + hi) / 2;

                if (check(middle) <= b) {
                    result = middle;
                    lo = middle + 1;
                }
                else
                    hi = middle - 1;
            }

            System.out.println(result);
        }

        public static int check ( int c){ // 반환값을 long으로 수정

            int total = 0;

            for (int i = 0; i < a; i++) {
                if (arr[i] <= c)
                    total += c - arr[i];
            }
            return total;
        }

}

/*
  67 프로 까지만 답이 맞다고 뜨는데 다시 풀어서 올리겠습니다...
 */
