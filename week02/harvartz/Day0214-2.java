import java.io.*;
import java.security.Key;
import java.util.*;

/*
* 백준 : https://www.acmicpc.net/problem/20291 (파일 정리) [문자열]
* */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 확장자 별로 정리해서 몇 개씩 있는지 알려줘
        // 보기 편하게 확장자들을 사전 순으로 정렬해줘

        HashMap<String, Integer> input = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String str = br.readLine();
            // .이후의 문자열만 분리하고 싶은데
            StringBuilder extension = new StringBuilder();
            for (int x = 0; x < str.length(); x++) {
                if (str.charAt(x) == '.') {
                    while (x++ != str.length() - 1) {
                        extension.append(str.charAt(x));
                    }
                }
            }
            input.put(extension.toString(), input.getOrDefault(extension.toString(), 0) + 1);
        }
        // HashMap을 사용하면 빠르긴 한데 사전순으로 어떻게 정렬하지?
        Map<String, Integer> sortedResult = new TreeMap<>(input);

        sortedResult.forEach((Key, Value) -> {
            System.out.println(Key + " " + Value);
        });
    }

}