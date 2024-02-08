import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb=new StringBuilder();
        int start=0;
        while(n-->0){
            int input=Integer.parseInt(br.readLine());
            //System.out.println("현재의 인풋 = "+input+", start = "+start);
            if(input>start){
                for(int i=start+1;i<=input;i++){
                    sb.append('+').append('\n');
                    stack.push(i);
                }
                start=input;
            } else if(stack.peek()!=input){
                //System.out.println("현재 뽑을 값 = "+stack.peek()+", input = "+input);
                System.out.println("NO");
                return;
            }
            sb.append('-').append('\n');
            stack.pop();
        }
        System.out.println(sb.toString());
        br.close();
    }
}
