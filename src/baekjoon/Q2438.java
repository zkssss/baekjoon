package baekjoon;

import java.util.Scanner;

public class Q2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String star = "*";
		
		for(int i=0;i<n;i++) {
			System.out.println(star);
			star+="*";
		}
	}
}
