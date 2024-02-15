import java.io.*;
import java.util.*;
/*
* 최대점수구하기 (인프런)
* */

class Main {

    static int m;
    static int n;
    static int[] score;
    static int[] runningTime;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        score = new int[n];
        runningTime = new int[n];

        for (int x = 0; x < n; x++) {
            st = new StringTokenizer(br.readLine());
            score[x] = Integer.parseInt(st.nextToken());
            runningTime[x] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0, 0);
        System.out.println(result);
    }

    static void dfs(int level, int totalScore, int totalTime) {
        if (m < totalTime) return;
        if (level == n) {
            result = Math.max(result, totalScore);

        } else {
            dfs(level + 1, totalScore + score[level], totalTime + runningTime[level]);
            dfs(level + 1, totalScore, totalTime);
        }
    }
}