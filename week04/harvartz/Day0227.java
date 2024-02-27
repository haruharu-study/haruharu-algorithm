import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 생태학 https://www.acmicpc.net/problem/4358
* */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, Integer> plants = new TreeMap<>();

        int size = 0;
        String input;
        while ((input = br.readLine()) != null) {
            size++;
            plants.put(input, plants.getOrDefault(input, 0) + 1);
        }

        for (String x : plants.keySet()) {
            System.out.println(x + " " + String.format("%.4f", (float) (plants.get(x) * 100) / (float) size));
        }
    }
}