package 조건문;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		b+=c;
		
		while(b>=60) {
			a+=1;
			b-=60;
		}
		while(a>=24) {
			a-=24;
		}
		
		System.out.println(a+" "+b);
		sc.close();
	}
}
