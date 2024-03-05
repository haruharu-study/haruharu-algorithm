package stack_queue.JH;

import java.util.*;

class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) Math.ceil((100 - progresses[i]) / (double) speeds[i]));
        }

        int count = 1;
        int k = queue.poll(); // 첫 번째 작업의 개발 기간
        while (!queue.isEmpty()) {
            int next = queue.poll();

            if (k >= next) {
                count++; // 현재 작업의 개발이 완료된 후에 다음 작업의 개발 기간을 계산
            } else {
                ans.add(count);
                count = 1; // 새로운 작업의 개발이 완료된 경우 count 초기화
                k = next;
            }
        }
        ans.add(count); // 마지막에 남은 작업 추가

        answer = new int[ans.size()];

        int cc = 0;
        while (!ans.isEmpty()) {
            answer[cc++] = ans.poll();
        }

        return answer;
    }
}
