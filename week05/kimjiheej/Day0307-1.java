import java.io.*;
import java.util.StringTokenizer;
import java.util.*;


public class Algo24480 {

    final static int MAX = 1000000 * 10;
    static ArrayList<Integer>[] graph;

    static boolean[] visited;
    static int M, N, R;
    static int[] answer;
    static int order;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st =new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        graph = new ArrayList[MAX];


        for(int i = 1; i<=N; i++){
           graph[i] = new ArrayList<>();
        }

        visited = new boolean[MAX];
        answer = new int[MAX];
        order = 1;

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x].add(y);
            graph[y].add(x);
        }

        for(int i = 1; i<=N; i++)
           Collections.sort(graph[i], Collections.reverseOrder());

        dfs(R);

        for(int i=1; i<=N; i++){
            if(answer[i] != 0)
                bw.write(answer[i]+"\n");
            else
                bw.write(0 + "\n");
        }

        bw.flush();
        bw.close();

    }

    public static void dfs(int idx){
        visited[idx] = true;
        answer[idx] = order;
        order++;

        for(int i = 0; i<graph[idx].size(); i++){
            int next = graph[idx].get(i);
            if(visited[next]==false)
                dfs(next);
        }

    }
}
/*
  Collections.sort 의 내림차순
  Collections.sort(graph[i]);

  Collections.sort 의 오름차순
  Collections.sort(graph[i], Collections.reverseOrder());

 */