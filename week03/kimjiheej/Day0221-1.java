import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Algo1012{


    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    static int array[][];

    static boolean visitied[][];


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int total;

        for (int i = 0; i < a; i++) {


            st = new StringTokenizer(br.readLine());

            int garo = Integer.parseInt(st.nextToken()); // 10
            int sero = Integer.parseInt(st.nextToken()); // 8
            int count = Integer.parseInt(st.nextToken()); // 17
            Queue<int[]> q = new LinkedList<>();

            array = new int[garo][sero];
            visitied = new boolean[garo][sero];

            for (int p = 0; p < count; p++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                array[x][y] = 1;
            }

            total = 0;
            for (int j = 0; j < garo; j++) {
                for (int k = 0; k < sero; k++) {

                    if (array[j][k] == 0 || visitied[j][k] == true)
                        continue;
                    q.offer(new int[]{j, k});
                    total++;
                    visitied[j][k] = true;

                    while (!q.isEmpty()) {

                        int[] temp = q.poll();
                        int x = temp[0];
                        int y = temp[1];

                        for (int u = 0; u < 4; u++) {
                            int dix = x + dx[u];
                            int diy = y + dy[u];

                            if (dix < 0 || diy < 0 || dix >= garo || diy >= sero)
                                continue;
                            if (array[dix][diy] == 0 || visitied[dix][diy])
                                continue;
                            q.add(new int[]{dix, diy});
                            visitied[dix][diy] = true;

                        }
                    }


                }
            }
            sb.append(total+"\n");
        }


        System.out.println(sb.toString());
    }


}

