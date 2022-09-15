package 입출력과_사칙연산;

import java.util.Scanner;

public class Q3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[]{1,1,2,2,2,8};
		int[] b = new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]-b[i]+" ");
		}
	}
}
