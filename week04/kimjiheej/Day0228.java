import java.util.*;
class Programmers_폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        Set<Integer> s = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            s.add(nums[i]);
        }

        if(s.size() >= nums.length/2)
            return nums.length/2;
        else
            return s.size();

    }
}