import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(hansu(i)!=0) {
				sum+=1;
			}
		}
		System.out.println(sum);

	}
	public static int hansu(int num) {

		if(num<100) {
			return num;
		}
		else if(num>=100&&num<1000) {
			int num1=num/100;
			int num2=num%100/10;
			int num3=num%10;
			if(Math.abs(num1-num2)==Math.abs(num2-num3)) {
				if(num1>=num2 && num2>=num3) {
					return num;
				}
				else if(num1<=num2&& num2<=num3) {
					return num;
				}
			}
		}
		else return 0;
		return 0;
	}

}