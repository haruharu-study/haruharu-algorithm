package com.backjoon.solution.problem_1707;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    boj 7569 토마토
 */
public class Main {

    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(input.readLine());

        for (int t = 1; t <= T; t++) {
            st = new StringTokenizer(input.readLine());

            int V, E;
            V = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            // [1, N]
            graph = new List[V+1];
            for (int i = 1; i <= V; i++)
                graph[i] = new ArrayList<>();

            for (int i = 1; i <= E; i++) {
                st = new StringTokenizer(input.readLine());

                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                graph[from].add(to);
                graph[to].add(from);
            }

            boolean[] isVisit = new boolean[V+1];
            int cnt = 1;

            Queue<Integer> queue = new LinkedList<>();
            queue.add(1);
            isVisit[1] = true;

            while (!queue.isEmpty()) {
                int node = queue.poll();

                for (int nextNode : graph[node]) {
                    if (isVisit[nextNode]) continue;

                    queue.add(nextNode);
                    cnt++;
                    isVisit[nextNode] = true;
                }
            }

            if (cnt != V)
                System.out.println("NO");
            else
                System.out.println("YES");

        }
    }
}