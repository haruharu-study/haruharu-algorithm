import java.io.*;
import java.util.*;
/*
* 바둑이 승차 (인프런)
* */

class Main {
    static int n, c;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        for (int x = 0; x < n; x++) {
            arr[x] = Integer.parseInt(br.readLine());
        }
        recur(0, 0, arr);
        System.out.println(answer);
    }

    static void recur(int level, int sum, int[] arr) {
        if (sum > c) return;
        if (level == 5) {
            answer = Math.max(answer, sum);
        } else {
            recur(level + 1, sum + arr[level], arr);
            recur(level + 1, sum, arr);
        }
    }
}