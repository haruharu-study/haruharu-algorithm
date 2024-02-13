import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algo1920 {

    // 이분 탐색 관련 기본 문제


    static int arr[];
    static int array[];

    static int a;
    static int b;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(br.readLine());

        arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        b = Integer.parseInt(br.readLine());

        array = new int[b];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < b; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < b; i++) {
            if (binarySarch(array[i]) >= 0){
                sb.append(1).append('\n');
        }
            else {
                sb.append(0).append('\n');
            }
    }

        System.out.println(sb.toString());
    }

    static int binarySarch(int key){

       int lo = 0;
       int hi = arr.length -1;

       while(lo <= hi){
           int mid = (lo + hi )/2;

           if(key < arr[mid]){
               hi = mid-1;
           }
           else if(key > arr[mid]){
               lo = mid+1;
           }
           else {
               return mid;
           }
       }
       return -1;
    }
}
