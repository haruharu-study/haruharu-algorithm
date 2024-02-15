import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        int len = input.length();
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        boolean isTag = false;
        for(int i=0;i<len;i++){
            char c= input.charAt(i);
            //System.out.println(">> 현재 탐색중인 단어 = "+c);
            if(c=='<'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                isTag=true;
            } else if (c=='>') {
                isTag=false;
                sb.append(c);
                continue;
            }
            //System.out.println("       현재 sb = "+sb);
            if(isTag){
                sb.append(c);
            } else {
                if(c==' '){
                    while(!stack.isEmpty()){
                        //System.out.println("[tag=false , 공백]"+stack.peek()+"을 추가");
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                    continue;
                }else {
                    stack.push(c);
                }
            }
            //System.out.println("       현재 sb = "+sb);
            if(i==input.length()-1){
                while(!stack.isEmpty()){
                    //System.out.println("[마지막에 다시 돌리기]"+stack.peek()+"을 추가");
                    sb.append(stack.pop());
                }
            }
            //System.out.println(sb);
        }
        //System.out.println("===============");
        System.out.println(sb);
    }
}
