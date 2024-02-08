import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt1_10872_김지희 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        System.out.println(fact(a));



    }

    public static int fact(int a){

        if(a==0)
            return 1;

        return a * fact(a-1);
    }
}
