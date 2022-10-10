package 기본수학2;

import java.util.Scanner;

public class Q9020_골드바흐의_추측 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = n / 2;
			int b = n / 2;
			boolean demical = true;
			
			while(demical) {
				boolean flag = true;
				for (int j = 2; j < a; j++) {
					if (a % j == 0) {
						flag = false;
						break;
					}
				}
				for (int j = 2; j < b; j++) {
					if (b % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					sb.append(a + " " + b + "\n");
					demical=false;
				} else {
					a--;
					b++;
				}
			}

		}
		System.out.println(sb);
	}
}
