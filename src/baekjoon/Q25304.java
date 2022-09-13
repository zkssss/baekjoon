package baekjoon;

import java.util.Scanner;

public class Q25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] receipt = new int[n];
		int hap = 0;
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			receipt[i] = a*b;
		}
		
		for(int i : receipt) {
			hap+=i;
		}
		
		if(hap==x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
