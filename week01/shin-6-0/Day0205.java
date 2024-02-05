import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Day0205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            String input = br.readLine();
            if(input.startsWith("push")){
                int inputInt= Integer.parseInt(input.substring(5));
                stack.push(inputInt);
            } else if (input.equals("pop")) {
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    int pop = stack.pop();
                    System.out.println(pop);
                }
            } else if (input.equals("size")) {
                System.out.println(stack.size());
            } else if (input.equals("empty")) {
                if(stack.isEmpty()){
                    System.out.println("1");
                }else{
                    System.out.println("0");
                }
            } else if (input.equals("top")) {
                if(stack.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(stack.peek());
                }
            }
        }
        System.out.println();
        br.close();
    }
}