import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Algo11659 {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        long[] s = new long[a+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=1; i<=a; i++){
            s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        int j;

        for(j=0; j<b; j++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int p = Integer.parseInt(stringTokenizer.nextToken());
            int q = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(s[q] - s[p-1]);
        }
    }
}
