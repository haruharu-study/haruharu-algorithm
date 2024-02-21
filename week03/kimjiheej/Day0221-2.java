import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.*;

public class Algo7576 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static int[][] map;
    static int[][] dist;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//6
        int m = Integer.parseInt(st.nextToken());//4

        Queue<int[]> q = new LinkedList<>();

        map = new int[m][n];
        dist = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1)
                    q.add(new int[]{i, j});
            }
        }

        // 이제 map 에다가 넣어 주었으면 무엇을 해야할까 ?

        int count = 0;
        // 처음으로 꺼낸것부터 시작을 해주어야 한다.

        int result1 = 0;
        int result2 = 0; // 개수 세는 것이다

        while (!q.isEmpty()) {

            int[] array = q.poll();
            int nx = array[0];
            int ny = array[1];

            for (int i = 0; i < 4; i++) {
                int a = nx + dx[i];
                int b = ny + dy[i];

                if (a < 0 || b < 0 || a >= m || b >= n)
                    continue;
                if (map[a][b] == -1 || dist[a][b] > 0 || map[a][b] == 1)
                    continue;

                dist[a][b] = dist[nx][ny] + 1;

                q.add(new int[]{a, b});
                result1 = dist[a][b];

            }

        }


//      for(int i=0; i<m; i++){
//          for(int j=0; j<n; j++) {
//              System.out.print(dist[i][j] + " ");
//          }
//          System.out.println();
//      }
        boolean check = true;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 0) {
                    if (dist[i][j] <= 0) {
                        check = false;
                        break;
                    }
                }
            }

            if(check==false)
                break;
        }

        if(check==false)
            System.out.println("-1");
        else
            System.out.println(result1);
    }

}