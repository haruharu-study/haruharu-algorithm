import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Day0222-1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken()); // 전체 수
        int s = Integer.parseInt(st.nextToken()); // 한 방에 몇명

        // 여자 먼저 count 해주기

        int[][] check = new int[num][2];

        for(int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            check[i][0] = p;
            check[i][1] = q;
        }

        // 여자 count 해주기
        int total = 0;

        int[] w = new int[7];
        int[] b = new int[7];

        for(int i=0; i<num; i++){
            if(check[i][0] == 0)  // 여자라는 의미이다
            {
                int k = check[i][1];
                w[k]++;
            }
            else
            {
                int q = check[i][1];
                b[q]++;
            }
        }

        for(int j=1; j<7; j++)
        {
            if(w[j] % s == 0)
                total += w[j]/s;
            else
                total += (w[j]/s)+1;
        }


        for(int j=1; j<7; j++)
        {
            if(b[j] % s == 0)
                total += b[j]/s;
            else
                total += (b[j]/s)+1;
        }

        System.out.println(total);


        // 남자 count 해주기
    }
}
