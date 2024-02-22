import java.io.*;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Algo13328 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean check = true;
            String p = st.nextToken();
            String q = st.nextToken();

            char[] array = p.toCharArray();
            char[] array1 = q.toCharArray();

            Arrays.sort(array);
            Arrays.sort(array1);

            for (int j = 0; j < array.length; j++) {
                if (array[j] != array1[j]) {
                    check = false;
                    bw.write("Impossible");
                    bw.write("\n");
                    break;
                }
            }

            if (check == true) {
                bw.write("Possible");
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
    }
}