import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Algo1182 {

    static int arr[];
    static int a;
    static int b;

    static int cnt = 0;
    public static void main(String[] args) throws IOException {

        // 백트래킹의 부분수열 문제입니다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken()); // 개수
        b = Integer.parseInt(st.nextToken()); // 총 합

        arr = new int[a];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 부분 수열의 개수를 구하고 양수인 수열만 구해야 한다.

        func(0,0);
        if(b==0)
            cnt--;
        System.out.println(cnt);
    }

    public static void func(int cur, int tot){ // cur 은 현재 배열의 인덱스이다. tot 은 현재 총 합계이다

        if(cur==a){
            if(tot==b)
                cnt++;
            return;
        }

        func(cur+1,tot);
        func(cur+1,tot+arr[cur]);

    }
}

/*

  넘 어렵다... 백트래킹... 재귀....
 */
