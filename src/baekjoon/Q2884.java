package baekjoon;

import java.util.Scanner;

public class Q2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45<0) {
			h-=1;
			m-=45;
			m = 60 - Math.abs(m);
			if(h<0) {
				h = 24+h;
			}
		}else {
			m-=45;
		}
		
		System.out.println(h+" "+m);
	}
}
