package 재귀;

import java.util.Scanner;

public class Q10870_피보나치수5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(a(n));
	}
	
	static int a(int num) {
		if(num==0) return 0;
		if(num==1) return 1;
		return a(num-1)+a(num-2);
	}
}


