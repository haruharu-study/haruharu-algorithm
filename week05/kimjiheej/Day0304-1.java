import java.io.*;
import java.util.StringTokenizer;

public class Algo2606 {

    static int[][] graph;

    static boolean visitied[];

    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        graph = new int[a+1][a+1];
        visitied = new boolean[a+1];


        for(int i=0; i<b; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        dfs(1);

        System.out.println(answer-1);
    }

    public static void dfs(int a){

        // 종료 조건 설정
        visitied[a] = true;
        answer++;

        // 풀이 조건 설정

        for(int i=0; i<visitied.length; i++){
            if(!visitied[i] && graph[a][i] == 1)
                 dfs(i);
        }


    }
}
/*
 문제의 키워드는 네트워크 라는 키워드이다 -> 네트워크
 그래프가 연걸 -> 연결되어 있구나 -> DFS/BFS 겠구나 !
 간선의 정보를 쌍으로 이루어져 있다. 하지만 문제는 저런 식의 정보를 가지고 풀기는 어렵다.
 가장 중요한 것은 정보를 어떻게 가공해서 문제를 풀까 ? 이다.
 */


