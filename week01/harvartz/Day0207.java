import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Day0207 {
    static int n, total = 0;
    static boolean flag = false;
    static String answer = "NO";
    public static void Day0207(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int x = 0; x<n; x++){
            arr[x] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0, arr);
        System.out.println(answer);
    }

    public static void dfs(int level, int sum, int[] arr){
        if(flag) return;
        if(sum > total / 2) return;
        if(level == n){
            if((total - sum) == sum){
                answer = "YES";
                flag = true;
            }
        }else{
            dfs(level + 1, sum + arr[level], arr);
            dfs(level+1, sum, arr);
        }
    }
}
