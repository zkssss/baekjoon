package baekjoon;

import java.util.Scanner;

public class Q1330 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c="";
		
		if(a>b) {
			c=">";
		}else if(a<b) {
			c="<";
		}else {
			c="==";
		}
		
		System.out.println(c);
	}
}
