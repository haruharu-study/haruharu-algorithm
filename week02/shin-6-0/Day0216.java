package backjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day0216 {
//문제 : 백준 1009 분산처리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a%10==0){
                System.out.println(10);
            }else{
                b=(b%4)+4;
                int ans = (int) (Math.pow(a,b)%10);
                System.out.println(ans);
            }
        }
    }
}
