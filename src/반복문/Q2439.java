package 반복문;

import java.util.Scanner;

public class Q2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = n;
		String blank = " ";
		String star = "*";
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<count-1;j++) {
				System.out.print(blank);
			}
			System.out.println(star);
			count--;
			star+="*";
		}
	}
}
