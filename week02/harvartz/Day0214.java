import java.io.*;
import java.util.*;
/*
* 부분 집합 구하기 (인프런)
* */

class Main {
    static int n;
    static int[] ch;

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        ch = new int[n + 1];
        recur(1);
    }

    static void recur(int level) {
        if (level == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + "");
            }
            if (!tmp.isEmpty()) System.out.println(tmp);
        } else {
            ch[level] = 1;
            recur(level + 1);
            ch[level] = 0;
            recur(level + 1);
        }
    }
}