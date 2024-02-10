import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Haru_1629 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Integer.parseInt(st.nextToken());
        long b= Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());

        long check = cc(a,b,c);
        System.out.println(check);

    }

    public static long cc(long a, long b, long c){

        if(b==1)
            return a % c;

       long  val = cc(a,b/2,c);

        val  = val * val % c ;

        if(b%2==0)
            return val;

        return val * a % c;

    }
}
// 재귀다 너무 어렵다 !!
// 제곱수의 나머지를 구하는 문제이다

