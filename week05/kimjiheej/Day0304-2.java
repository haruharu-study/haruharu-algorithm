package stack_queue.JH;
import java.util.*;

public class 같은숫자는싫어 {

    static int answer[];
    static int origin[];

    public int[] solution(int []arr) {


        Stack<Integer> s = new Stack<>();

        s.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(s.peek() == arr[i])
                continue;
            s.add(arr[i]);
        }

        int j =0;

        answer = new int[s.size()];
        origin = new int[s.size()];
        while(!s.isEmpty()){
            origin[j++] = s.pop();
        }

        // 배열을 뒤집어 주기만 하면 된다.

        for(int k=0; k<origin.length; k++){
            answer[k] = origin[origin.length-1-k];
        }


        return answer;
    }
}