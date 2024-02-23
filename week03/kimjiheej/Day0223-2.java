=import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo11660 {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 일단 배열을 넣는 것은 중요하지 않다

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken()); // 2차원 배열의 크기
        int b = Integer.parseInt(stringTokenizer.nextToken()); // 구간 합 질의의 개수

        int[][] array = new int[a+1][a+1];


        int i,j;

        for(i=1; i<=a; i++){
            stringTokenizer  = new StringTokenizer(bufferedReader.readLine());
            for(j=1; j<=a; j++)
            {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int[][] d = new int[a+1][a+1];

        for(i=1; i<=a; i++){
            for(j=1; j<=a; j++){
                d[i][j] = d[i-1][j] + d[i][j-1] - d[i-1][j-1] + array[i][j];
            }
        }


        int k =0;

        for(k=0; k<b; k++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int answer;

            answer = d[x2][y2] -d[x1-1][y2] - d[x2][y1-1] + d[x1-1][y1-1];

            System.out.println(answer);
        }
    }
}
