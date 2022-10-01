package 그리디;

import java.util.Scanner;

public class Q14659_한조서열정리하고옴 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		활잡이의 수
		int n = sc.nextInt();
//		봉우리의 높이
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
//		킬 수
		int[] kills = new int[n];
		for (int i = 0; i < n - 1; i++) {
			int kill = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					kill++;
				} else {
					break;
				}
			}
			kills[i] = kill;
		}
//		최대 킬 수
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (kills[i] > max) {
				max = kills[i];
			}
		}
		System.out.println(max);

	}
}
