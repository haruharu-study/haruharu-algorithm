import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        String[] arr= new String[t];
        /*
        여는 괄호'('일 경우 스택에 넣고,
        닫는 괄호')'일 경우 비어있으면 NO를 리턴, 아니면 '('를 하나 빼기
         */
        for(int i=0;i<t;i++){
            arr[i]=br.readLine();
            Stack<String> stack=new Stack<>();
            String output="YES";
            here:
            for(int j=0;j< arr[i].length();j++){
                char c=arr[i].charAt(j);
                if(c=='('){
                    stack.push(String.valueOf(c));
                } else if (stack.empty()) {
                    output="NO";
                    break here;
                }else{
                    stack.pop();
                }
            }
            if(!stack.isEmpty()){
                output="NO";
            }
            System.out.println(output);
        }

        br.close();
    }
}