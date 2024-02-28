import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* https://www.acmicpc.net/problem/2870
* */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<String> result = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\d+");
        for (int x = 0; x < N; x++) {
            String input = br.readLine();
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String num = matcher.group().replaceAll("^0+", "");
                result.add(num.length() == 0 ? "0" : num);
            }
        }
        result.sort((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
        StringBuilder sb = new StringBuilder();
        for (String x : result) {
            sb.append(x + "\n");
        }
        System.out.println(sb);

    }
}