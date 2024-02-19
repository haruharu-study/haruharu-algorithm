import java.util.ArrayList;
import java.util.Scanner;

/*
* 피자 배달 거리(삼성 SW역량평가 기출문제 : DFS활용)
* */

class Main {
    static int n, m, len;
    static ArrayList<Point> hs, pz;
    static int[] combi; //pz에서 m개 뽑아서 여기 넣음
    static int answer = Integer.MAX_VALUE; //최소값 구함

    public static void DFS(int L, int s) {
        if (L == m) { //조합의 경우의 수 m개 다 뽑았을 때
            int sum = 0; //이 조합의 경우 도시의 피자배달거리
            for (Point h : hs) { //집 순회
                int dis = Integer.MAX_VALUE; //제일 가까운 피자집과의 거리

                for (int i : combi) { //피자집 m개 순회
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis; //누적합
            }
            answer = Math.min(answer, sum); //도시의 피자배달거리 중 최소값
        } else {
            //combi : 피자집 m개 뽑기
            for (int i = s; i < len; i++) { //피자집 순회
                combi[L] = i; //ArrayList의 인덱스 번호
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        //1은 집, 2는 피자집
        hs = new ArrayList<>();
        pz = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = in.nextInt();
                if (tmp == 1) hs.add(new Point(i, j));
                else if (tmp == 2) pz.add(new Point(i, j));
            }
        }

        len = pz.size();
        combi = new int[m]; //len C m
        DFS(0, 0);
        System.out.println(answer);

    }

    static class Point {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}