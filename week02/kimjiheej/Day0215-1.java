import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


public class Algo16564 {

    static int a;
    static long b;

    static long arr[];


    public static void main (String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken()); // 배열의 개수
        b = Long.parseLong(st.nextToken()); // 올릴 수 있는 레벨의 총합

        arr = new long[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        long lo = 1;
        long hi = arr[a - 1] + b; // 수정된 부분

        while (lo <= hi) {

            long middle = (lo + hi) / 2;

            if (check(middle) > b)
                hi = middle - 1;
            else
                lo = middle + 1;
        }

       // System.out.println(lo-1);
        System.out.println(hi);
    }

    public static long check ( long c){ // 반환값을 long으로 수정

        long total = 0;

        for (int i = 0; i < a; i++) {
            if (arr[i] < c)
                total += c - arr[i];
        }
        return total;
    }

}