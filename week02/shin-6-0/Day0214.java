import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String command=br.readLine();

            if(command.contains("push_front")){
                int input= Integer.parseInt(command.substring(11));
               // System.out.println("push_front | "+input);
                ad.addFirst(input);
            } else if (command.contains("push_back")) {
                int input= Integer.parseInt(command.substring(10));
                //System.out.println("push_back | "+input);
                ad.addLast(input);
            } else if (command.equals("pop_front")) {
                if(ad.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(ad.pollFirst());
                }
            }else if (command.equals("pop_back")){
                if(ad.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(ad.pollLast());
                }
            } else if (command.equals("size")) {
                System.out.println(ad.size());
            } else if (command.equals("empty")) {
                if(ad.isEmpty()){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            } else if (command.equals("front")) {
                if(ad.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(ad.getFirst());
                }
            } else if (command.equals("back")) {
                if(ad.isEmpty()){
                    System.out.println("-1");
                }else{
                    System.out.println(ad.getLast());
                }
            }
        }
        br.close();
    }
}
