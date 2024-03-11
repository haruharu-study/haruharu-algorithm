package heap.JH;

import java.util.*;

class 더맵게 {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        int answer = 0;
        
        while(pq.peek() < K){
            
            if(pq.size() == 1)
                return -1;
            
            int first = pq.poll();
            int second = pq.poll();
            
            
            int sum = 0;
            answer++;
            sum = first + (second * 2);
            
            pq.add(sum);
            
        }
        
        return answer;
    }
}
/*
  우선순위 큐의 사이즈가 1개이면 -1 인 조건을 생각하지 못하였다 !
 */