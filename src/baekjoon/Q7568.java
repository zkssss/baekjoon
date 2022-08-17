package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] bulk = new int[n][2];
		int count = 0;
		ArrayList<Integer> countArray = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			bulk[i][0] = sc.nextInt();
			bulk[i][1] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && bulk[i][0] < bulk[j][0] && bulk[i][1] < bulk[j][1]) {
					count++;
				}
			}
			countArray.add(count + 1);
			count = 0;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(countArray.get(i) + " ");
		}
	}

}
