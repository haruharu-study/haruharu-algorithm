import java.io.*;
import java.util.StringTokenizer;

public class Algo11724 {

     static int[][] graph;

     static boolean visitied[];

     static int N,M;

     static int answer;

     static int count = 0;




    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 그래프에 모든 정보를 채운다.

        visitied = new boolean[N+1];
        graph = new int[N+1][N+1];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;


        }


        for(int i = 1; i<=N; i++){
            if(visitied[i] == false) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);



    }

     public static void dfs (int a){

        visitied[a] = true;


        for(int i=1; i<=N; i++){
            if(!visitied[i] && graph[a][i] == 1)
                dfs(i);
        }



     }
}

/*
 핵심 키워드는 연결 요소이다. 방향 없는 그래프. 이것은 그래프를 다루어야 하는구나 !
 그리고 연결된 요소를 구해야 하는구나 !
 */
