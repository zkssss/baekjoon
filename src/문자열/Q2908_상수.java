package 문자열;

import java.util.Scanner;

public class Q2908_상수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String newA = "";
		String newB ="";
		
		while(a != 0) {
			newA = newA + a%10;
			a = a/10;
		}
		while(b != 0) {
			newB = newB + b%10;
			b = b/10;
		}

		if(Integer.parseInt(newA) > Integer.parseInt(newB)) {
			System.out.println(newA);
		}else {
			System.out.println(newB);
		}
	}
}
