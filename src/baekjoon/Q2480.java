package baekjoon;

import java.util.Scanner;

public class Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int prize =0;
		
		if(a==b & b==c) {
			prize = 10000+(a*1000);
		}else if(a==b & a!=c || a==c & a!=b || b==c & a!=b) {
			int i = 0;
			if(a==b) {
				i=a;
			}else if(a==c) {
				i=a;
			}else if(b==c) {
				i=b;
			}
			prize = 1000+(i*100);
		}else if(a!=b & b!=c & a!=c) {
			int i=0;
			if(a>b) {
				i=a;
			}else {
				i=b;
			}
			if(c>i) {
				i=c;
			}
			prize = i*100;
		}
		System.out.println(prize);
		
	}

}
