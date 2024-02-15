import java.io.*;
import java.util.*;

class Main {

    static int[] pm;
    static int n, m;
    static Integer[] coins;
    static int answer = Integer.MAX_VALUE;

    // level이 동전의 갯수이기 때문에 동전 갯수에 대한 count 배열이 필요없다.
    public void DFS(int level, int sum) {
        if (sum > m) return;
        if (level >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, level);
        } else {
            for (int x = 0; x < n; x++) {
                DFS(level + 1, sum + coins[x]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        coins = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int x = 0; x < n; x++) {
            coins[x] = Integer.parseInt(st.nextToken());
        }
        // 큰 숫자부터 dfs를 돌면 조금 더 효율적으로 진행된다. 
        // 왜냐하면 위에 answer보다 큰 경우는 바로 return 하기 때문이다.
        Arrays.sort(coins, Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());

        Main T = new Main();
        T.DFS(0, 0);
        System.out.println(answer);
    }
}