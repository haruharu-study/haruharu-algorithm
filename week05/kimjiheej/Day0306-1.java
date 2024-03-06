package stack_queue.JH;

import java.util.*;

class 올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        
        Stack<Character> ss = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] == '('){
                ss.push(arr[i]);
            }
            else {
                if(ss.isEmpty()){
                    return false;
                }
                if(ss.peek() == '(')
                    ss.pop();
                else 
                    return false;
            }
        }
        
       if(ss.isEmpty())
           return true;
        else 
            return false;
    }
}