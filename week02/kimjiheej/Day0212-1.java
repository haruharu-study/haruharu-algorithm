import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo15649 {


    static boolean isused[] = new boolean[10];
    static int check[] = new int[10];

    static int n;
    static int m;


    public static void main(String[] args) throws IOException {

        // 완전 탐색 문제이다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        dfs(0);

    }

    public static void dfs(int k){

        if(k==m){
            for(int i=0; i<m; i++){
                System.out.print(check[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=n; i++){
            if(!isused[i]){
                check[k] = i; // 넣은 다음에
                isused[i] = true; // 방문했다고 표시하기
                dfs(k+1);
                isused[i] = false;
            }
        }
    }
}
// dfs 로 구하면 된다 !!
