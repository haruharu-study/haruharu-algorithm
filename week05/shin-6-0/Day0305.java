import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day0305 {
	public static int func(int n) {
		int[] fibos = new int[n+1];
		fibos[1]=fibos[2]=1;
		for(int i=3;i<=n;i++) {
			fibos[i]=fibos[i-1]+fibos[i-2];
		}
		return fibos[n];
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		bw.append(func(n)+" "+(n-2));
		bw.close();
		br.close();
	}
}