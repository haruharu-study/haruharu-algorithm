import java.io.*;
import java.util.*;

/*
 * 조합의 경우의 수 (메모이제이션)
 * */

class Main {

    int[][] dy = new int[35][35];
    static int n, r;

    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) return 1;
        else return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        Main T = new Main();
        System.out.println(T.DFS(n, r));


    }
}